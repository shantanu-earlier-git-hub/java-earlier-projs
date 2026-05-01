package hackrank.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XorStrings {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str1= bufferedReader.readLine();
        String str2= bufferedReader.readLine();

        long val1 = Integer.parseInt("10101", 2);
        long val2 = Integer.parseInt("00101", 2);


        int res= (int) (val1 ^ val2);

        System.out.println(Integer.toBinaryString(res));

    }

}
