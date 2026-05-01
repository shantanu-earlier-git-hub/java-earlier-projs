package my_new_things;

import java.util.stream.Stream;

public class CheckContainsChar {

    public static void main(String[] args) {
        String strValue = "aaabcdefghijklmnopqrstuvwxyz";
        Stream.of(strValue.toCharArray())
                .forEach(ch -> {
                            for (int i = 0; i < strValue.length(); i++) {
                                CharSequence charSequence = Character.toString(ch[i]);
                                String subStr = strValue.substring(i+1);
                                if (! ( subStr.contains(charSequence)) ) {
                                    System.out.println("unique value " + charSequence);
                                }
                            }
                        }
                );
    }
}
