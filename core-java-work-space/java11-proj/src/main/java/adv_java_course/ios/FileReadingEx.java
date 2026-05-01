package adv_java_course.ios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingEx {

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("D:\\projects\\java11-pra\\java11-pra\\src\\main\\java\\adv_java_course\\ios\\BufferedReaderVsScanner.txt"));
        ){

            String firstLine = bufferedReader.readLine();
            System.out.println("firstLine = " + firstLine);

            StringBuilder stringBuilder = new StringBuilder();

            bufferedReader.lines().forEach( (line) -> stringBuilder.append(line + "\n"));
            System.out.println(stringBuilder);


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }


}
