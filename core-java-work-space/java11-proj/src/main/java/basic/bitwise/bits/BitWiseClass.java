package basic.bitwise.bits;

public class BitWiseClass {

    private static void convert2Binary() {
        Integer num = 12;
        System.out.println(Integer.toBinaryString(num));
    }

    private static void convert2Decimal() {
        System.out.println(Integer.parseInt("0111", 2));
    }

    public static void main(String[] args) {
        convert2Decimal();
        //convert2Binary();
    }

}
