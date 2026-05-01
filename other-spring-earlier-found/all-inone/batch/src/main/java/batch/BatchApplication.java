package batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.data.annotation.Id;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@SpringBootApplication
public class BatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchApplication.class, args);
    }

    @Bean
    FlatFileItemReader<Product> flatFileItemReader(@Value("classpath:/products.csv") Resource resource) {
        return new FlatFileItemReaderBuilder<Product>()
                .linesToSkip(1)
                .resource(resource)
                .name("dumpCsvToDb")
                .fieldSetMapper(fieldSet -> new Product(
                                fieldSet.readLong("id"),
                                fieldSet.readString("name"),
                                fieldSet.readString("description"),
                                fieldSet.readString("category"),
                                fieldSet.readDouble("price")
                        )
                )
                .delimited().names("id,name,description,category,price".split(","))
                .build();
    }

    @Bean
    JdbcBatchItemWriter<Product> jdbcBatchItemWriter(DataSource dataSource) {
        return new JdbcBatchItemWriterBuilder<Product>()
                .dataSource(dataSource)
                .assertUpdates(true)
                .sql("insert into product (id, name, description, category, price) values (?,?,?,?,?)")
                .itemPreparedStatementSetter((item, ps) -> {
                            ps.setLong(1, item.id());
                            ps.setString(2, item.name());
                            ps.setString(3, item.description());
                            ps.setString(4, item.category());
                            ps.setDouble(5, item.price());
                        }
                ).build();

    }


    @Bean
    Step step(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager,
              FlatFileItemReader<Product> flatFileItemReader, JdbcBatchItemWriter<Product> jdbcBatchItemWriter) {
        return new StepBuilder("dumToDbStep", jobRepository)
                .<Product, Product>chunk(5, platformTransactionManager)
                .reader(flatFileItemReader)
                .writer(jdbcBatchItemWriter)
                .build();
    }


    @Bean
    Job dumpToDb(JobRepository jobRepository, Step step) {
        return new JobBuilder("dumpToDb", jobRepository)
                .start(step)
                .incrementer(new RunIdIncrementer())
                .build();
    }

    record Product(@Id Long id, String name, String description, String category, Double price) {
    }

}
