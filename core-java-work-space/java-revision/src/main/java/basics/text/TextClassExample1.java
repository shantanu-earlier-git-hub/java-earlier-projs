package basics.text;

import java.util.Arrays;

public class TextClassExample1 {

    public static void main(String[] args) {

        Character[] chars = {'a', 'z', 'A', ' ', '_', '+', '>'};

        Arrays.stream(chars).forEach(value -> {

            System.out.println(" the type of value -> " + Character.getType(value));

            if (value == 'a') System.out.println(" is letter " + Character.isLetter(value));
            if (value == 'z') System.out.println(" is digit " + Character.isDigit(value));
            if (value == 'A') System.out.println(" is uppercase  " + Character.isUpperCase(value));
            if (value == ' ') System.out.println(" is space  " + Character.isSpaceChar(value));
            if (value == '_') System.out.println(" is under score connector punch  " +
                    (Character.getType(value) == Character.CONNECTOR_PUNCTUATION));


        });

    }
}
