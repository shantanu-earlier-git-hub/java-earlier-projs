package basic.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExClass1 {


    public static void main(String[] args) {

        //String regex1 = "^([a-zA-Z_$\\d]*)$";
        //String regex2= "([a-z]{2,})([A-Z])";

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter the Reg Pattern : ... ");
        String regex= scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);

        System.out.println(" Please enter the String: ... ");
        String input = scanner.nextLine();

        Matcher matcher =pattern.matcher(input);
        boolean found = false;
        while(matcher.find()){
            System.out.println(" string found  `" + matcher.group() + "` starting index -> " + matcher.start() +" ending index -> " + matcher.end());
            found = true;
        }
        if(!found){
            System.out.println(" Pattern doesn't match ");
        }

        scanner.close();
    }
}
