package mongo.app.repository;

import mongo.app.entity.company.Company;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CompanyRepository extends MongoRepository<Company, String> {
}
