package algos;

import java.util.Scanner;

public class BigIntSum {

    static char intToChar(int val){
        return (char)(val + '0');
    }

    static int charToInt(char val){
        return val - '0';
    }


    private static  StringBuffer[] swap(StringBuffer s1, StringBuffer s2){

        StringBuffer s3 = new StringBuffer();
        StringBuffer swappedString[] = new StringBuffer[2];

        s3= s1;
        s1=s2;
        s2=s3;

        swappedString[0] =s1;
        swappedString[1] =s2;

        return swappedString;
    }

    public static void main(String[] args) {


        //BigIntSum bigIntSum = new BigIntSum();

        Scanner scanner = new Scanner(System.in);
        StringBuffer [] swappedStrings=new StringBuffer[2];
        StringBuffer result = new StringBuffer();

        System.out.println("Please Enter First Number ");
        StringBuffer s1= new StringBuffer(scanner.nextLine());

        System.out.println("Please Enter Second Number ");
        StringBuffer s2= new StringBuffer(scanner.nextLine());

        if(s1.length() > s2.length()){
            swappedStrings= swap(s1, s2);
            s1= swappedStrings[0];
            s2= swappedStrings[1];
        }

        //System.out.println("s1 = " + s1);
        //System.out.println("s2 = " + s2);

        char [] charNum1= s1.reverse().toString().toCharArray();
        char [] charNum2= s2.reverse().toString().toCharArray();

        int carry =0;
        int n1 =0;
        int n2= 0;
        int sum =0;

        for(int i=0; i<charNum1.length; i++){
            n1= charToInt(charNum1[i]);
            n2= charToInt(charNum2[i]);
            sum = (n1+ n2 + carry);
            carry = (sum/10);

            result.append((sum%10));
        }

        for(int i=charNum1.length; i<charNum2.length; i++){
            n1= charToInt(charNum2[i]);
            sum = (n1+ carry);
            carry = sum / 10;
            result.append((sum%10));

        }

        if(carry ==1){
            result.append('1');
        }

        System.out.println("Addition=>  " + result.reverse());

    }
}
