package basics.ooa.classes;

public class Wrappers1 {


    public static void main(String... args) {

        //integers();
        otherStaticMethods();
    }


    private static void integers() {

        // create integer wrapper from int value
//        Integer intValueOf = Integer.valueOf(100);
//        System.out.println("intValue from integer primitive = " + intValueOf);
//
//        Integer intValueOf1 = Integer.valueOf("100");
//        System.out.println("intValue from string  = " + intValueOf1);
//
//        // 444 is 3 digits so starting from 0 to 2
//        // 4* 16 power to 2 + 4 * 16 power 1 + 4 * 16 power to 0 = 1092
//        Integer intValueOf2 = Integer.valueOf("444", 16);
//        System.out.println("intValue from string and radix = " + intValueOf2);
//
        // parse Int
//        Integer parsedInt1 = Integer.parseInt("123");
//        System.out.println("parse int from string  = " + parsedInt1);
//
//        // same as ValueOf with radix
//        Integer parsedInt2 = Integer.parseInt("444", 16);
//        System.out.println("parse int from string with radix  = " + parsedInt2);


//        Integer parsedInt3 = Integer.parseUnsignedInt("444");
//        System.out.println("parse unsigned int   = " + parsedInt3);

        // Number format exception thrown when try to convert to Integer if input is not integer type or cannot convert

        CharSequence chars = "444";
        // end index exclusive
        Integer parsedInt4 = Integer.parseUnsignedInt(chars, 0, 3, 16);
        System.out.println("parse unsigned int of har seqs   = " + parsedInt4);


    }

    private static void instanceMethods() {

        // deprecated
        //Integer number = new Integer();

        Number number = Integer.valueOf(0);

    }

    private static void otherStaticMethods() {

        System.out.println("sum 2 nums " + Integer.sum(10, 20));

        //
        System.out.println("binary strings " + Integer.toBinaryString(7));

        //hex
        System.out.println("hex strings " + Integer.toHexString(15));

        // octal is from 0 to 7 ...
        System.out.println("octal strings " + Integer.toOctalString(8));

        // return no of 1's bit in 2's complement of binary representation of given int.
        // e.g. if 001 -> 110 -> 110 +1 -> 111 -> returns 3
        System.out.println("bit count " + Integer.bitCount(2));

        // if num1 > num2 return 1 ; num1 < num2 return -1 ; num1 = num2 return 0
        System.out.println("compare " + Integer.compare(30, 20));

        System.out.println("decode  " + Integer.decode("#10"));
        System.out.println("decode hex " + Integer.decode("0x15"));

        System.out.println("decode string " + Integer.decode("676767676"));

        System.out.println("lowest 1 bit of 4 " + Integer.lowestOneBit(4));

        System.out.println("highest 1 bit of 4 " + Integer.lowestOneBit(4));

        // after converting to binary and reverse
        System.out.println("reverse  " + Integer.reverse(2));

        // signum - sign num --- +1 if positive , -1 if negative , 0 if 0
        System.out.println("signum() " + Integer.signum(6363636));


    }


}
