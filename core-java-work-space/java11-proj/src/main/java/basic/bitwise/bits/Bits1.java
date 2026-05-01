package basic.bitwise.bits;

public class Bits1 {

    // getting kth bit
    private static int getKthBit(int n, int k) {
        int mask = (1 << k);
        return (n & mask) > 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        int n =7;
        int k =2;

        System.out.println(" The " + (k+1) + " bit of num " +  n  +  ":  " + getKthBit(n, k));
    }

}
