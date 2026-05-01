package basic.bitwise.shift;

public class ShiftOperators {

    // if a and b  then leftShift num is a * pow(2, b)
    private static void leftShift() {

        int num = 2;
        byte b = (byte) (num << 2);
        num = num << 2;

        System.out.println("left shifted num = " + num);
        System.out.println("left shifted num byte value = " + b);
    }


    // if a and b  then rightShift num is a / pow(2, b)
    private static void rightShift() {
        int num = 10;
        num = num >> 2;
        System.out.println("right shifted num = " + num);
    }

    public static void main(String[] args) {
        leftShift();
        //rightShift();
    }
}
