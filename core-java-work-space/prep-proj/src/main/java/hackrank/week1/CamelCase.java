package hackrank.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CamelCase {

    /*

    S;M;plasticCup()  C;V;mobile phone  C;C;coffee machine  S;C;LargeSoftwareBook  C;M;white sheet of paper  S;V;pictureFrame

            S;M;plasticCup()"\n"
            C;V;mobile phone"\n"
            C;C;coffee machine"\n"
            S;C;LargeSoftwareBook"\n"
            C;M;white sheet of paper"\n"
            S;V;pictureFrame

     output
            plastic cup
            mobilePhone
            CoffeeMachine
            large software book
            whiteSheetOfPaper()
            picture frame
     */

    private static void separate(String str1, String str2) {

        str2 = str2.chars()
                .mapToObj(ch -> (char) ch)
                .map(ch -> Character.isUpperCase(ch) ? (" " + ch).toLowerCase() : String.valueOf(ch).toLowerCase())
                .collect(Collectors.joining());
        if (str2.contains("()")) {
            str2 = str2.replace("()", "");
        }
        System.out.println(str2.strip());

    }

    private static void combine(String str1, String str2) {

        str2 = Arrays.stream(str2.split(" "))
                .map(str ->
                        str.strip().replace(str.substring(0, 1),
                                str.substring(0, 1).toUpperCase()))
                .collect(Collectors.joining());
        if (str1.equalsIgnoreCase("M") ||
                str1.equalsIgnoreCase("V"))
            str2 = str2.replace(str2.substring(0, 1), str2.substring(0, 1).toLowerCase());
        if (str1.equalsIgnoreCase("M"))
            str2 = str2 + "()";

        System.out.println(str2);

    }


    private static void process(List<String> inputs) {
        inputs.stream()
                .map(str -> str.split(";"))
                .forEach(item -> {
                    if (item[0].equalsIgnoreCase("S")) {
                        separate(item[1], item[2]);
                    } else if (item[0].equalsIgnoreCase("C")) {
                        combine(item[1], item[2]);
                    }
                });
    }

    public static void main(String[] args) {

        try {
            var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            var lines = bufferedReader.readLine();
            process(Stream.of(lines.split("  ")).collect(Collectors.toList()));
            bufferedReader.close();

        } catch (Exception ioe) {
            System.out.println(ioe);
        }
    }
}
