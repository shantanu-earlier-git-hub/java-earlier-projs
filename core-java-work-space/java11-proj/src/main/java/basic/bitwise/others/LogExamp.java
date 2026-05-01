package basic.bitwise.others;

public class LogExamp {


    /*
        pow (2,5) = 32 so

        log 32 to base 2 = 5;

        n = n >> 1 if > 0 result ++;

        return result
     */

    private static void log2N(int n){

        double  result =0;

        while ( (n >>= 1) > 0) {
            result++;
        }
        System.out.println("result = " + result);
    }
    private static double logN(int n, int base ){

        return ( n > (base - 1 ) ) ? 1 + logN(n/base, base) : 0;
    }


    public static void main(String[] args) {

        int n =3;
        int base = 3;

        System.out.println("longN : " + logN(n, base));
        log2N(n);
    }
}
