package basics.ooa.classes;

public class Wrapper2 {


    public static void main(String[] args) {
        staticCharMethods();
    }


    private static void staticCharMethods() {

        Character character = Character.valueOf('a');

        CharSequence sequence = "abcdef";
        sequence.codePoints().forEach(ch -> {
            System.out.println((char) ch);
        });

        System.out.println("sequence.charAt Index = " + sequence.charAt(2));

    }

}
