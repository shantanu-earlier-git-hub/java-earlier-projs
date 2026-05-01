package basics.ooa.classes;

public class Example1 {

    public static void main(String[] args) {

        byte b = 127;
        short s = 32767; // 16 bit 2 to power 16

        int i = 0;
        i = 67889999;
        long l = 876778l;

        float f = 1 / 2f;
        double d = 100 / 100d;

        char c = 'a';

        // cast to Integer
        //i = d;

        // cast to long
        //l =f;


        // allowed no compile error // b -> s -> i -> l for integer values
        // for decimal values // f -> d
        // reverse not allowed
        // decimal values has to be casted to assign to integer values

        System.out.println(d);
        System.out.println(i);
        System.out.println(c);


    }


}



