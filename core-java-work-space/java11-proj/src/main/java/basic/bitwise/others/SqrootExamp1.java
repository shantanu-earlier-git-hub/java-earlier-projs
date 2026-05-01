package basic.bitwise.others;

/*
    n =36

    int a =0 result =0;
    while ( a > 0)  do

    if ( a + result ) * ( a + result ) > n
        a = a/ 2 , result =0;
    if ( a + result ) * ( a + result ) < n
        a= a/ 2 , result = a ;
    if ( a + result ) * ( a + result ) == n
            return result;
    end while
 */


public class SqrootExamp1 {

    public static void main(String[] args) {

        int N =256;
        int msb = (int)(Math.log(N));
        int a = 1 << msb;
        System.out.println("a = " + a);
        
        int result = 0;
        while (a != 0) {
            if ((result + a) * (result + a) <= N) {
                result += a;
            }

            // (a = a/2)
            a >>= 1;
        }
        System.out.println("result = " + result);
    }
}
