package basics.streams.lambda.collectors;

import java.util.stream.Stream;

public class CheckDuplicateChar {

    private static void createUltimateString(String strValue) {

        StringBuffer buffer = new StringBuffer();
        char[] chars = strValue.toCharArray();

        for (int i = 0; i < strValue.length(); i++) {
            CharSequence charSequence = Character.toString(chars[i]);
            String subStr = strValue.substring(i + 1);
            if (!(subStr.contains(charSequence))) {
                buffer.append(charSequence);
            }
        }
        System.out.println("buffer.toString() = " + buffer.toString());
    }

    public static void main(String[] args) {

        String strValue = "aaabcdefghijklmnopooooqrsppptuvwxssssyzzzzzzyyyyaaaabbccc";
        Stream.of(strValue)
                .forEach(str -> createUltimateString(str));
    }
}
