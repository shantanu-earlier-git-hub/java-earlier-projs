package basic.bitwise.bits;

public class BitWiseExamp {

    private static void uniqueNum(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i];
        }
        System.out.println("unique = " + unique);
    }

    private static void xorOfNums(int n1, int n2){
        System.out.println("xor of n1, n2 = " + (n1 ^ n2));
    }

    private static void twoUniqueNums(int arr[]) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }

        System.out.println("xor of all = " + result);

        int pos = 0;
        int temp = result;
        while ((temp & 1) == 0) {
            pos++;
            temp = temp >> 1;
        }

        int setA = 0;
        int setB = 0;
        int mask = (1 << pos);

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & mask) > 0)
                setA = setA ^ arr[i];
             else
                setB = setB ^ arr[i];
        }

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);
    }

    private static void isPowerOf4(int n) {
        isPowerOf2(n);
    }

    private static void isPowerOf2(int n) {

        // n !=0  is for checking n non zero value

        if (n != 0 && (((n) & (n - 1))) == 0)
            System.out.println("the num " + n + " is power of 2");
        else
            System.out.println("the num " + n + " is not power of 2");
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 4, 3, 2, 1, 6, 7};

        //uniqueNum(arr);
        //twoUniqueNums(arr);
        //isPowerOf4(64);

        xorOfNums(12, 6);
    }
}
