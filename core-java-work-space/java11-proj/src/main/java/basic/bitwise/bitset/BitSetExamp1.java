package basic.bitwise.bitset;

public class BitSetExamp1 {

    private static void checkEvenOdd(int n) {

        if( (n & 1) == 1  ) System.out.println("the number " + n + " is odd");
        else System.out.println("the number " + n + " is even");

    }

    private static void getBitAt(int n, int position){

        System.out.println(( ( n >> position) & 1));
    }


    public static void main(String[] args) {
/*
        000, 001, 010, 011, 100, 101, 110, 111
        checkEvenOdd(134);
        checkEvenOdd(13);
*/
        getBitAt(5, 2);

    }
}
