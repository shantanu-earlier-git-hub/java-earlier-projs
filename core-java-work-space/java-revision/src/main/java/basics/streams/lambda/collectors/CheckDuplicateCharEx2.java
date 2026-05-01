package basics.streams.lambda.collectors;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class CheckDuplicateCharEx2 {


    public static void main(String[] args) throws IOException {

        //String strValue = "aaabcdefghijklmnopooooqrsppptuvwxssssyzzzzzzyyyyaaaabbccc";

        // gets the value from command prompt when run the main method.
        // BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
        // Reader reader = new InputStreamReader(bufferedInputStream);

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new BufferedInputStream(System.in)));

        String strValue = bufferedReader.readLine();

        Set<Character> characterSet =
                strValue
                        .strip()
                        .replaceAll(" ", "")
                        .chars()
                        .mapToObj(ch -> (char) ch)
                        .collect(toSet());

        String ultimateString = characterSet
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(ultimateString);

    }
}
