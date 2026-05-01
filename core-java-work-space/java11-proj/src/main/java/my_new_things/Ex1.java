package my_new_things;

import java.util.Arrays;
import java.util.List;

public class Ex1 {


    public static void main(String[] args) {

        List<String> presidentList = Arrays.asList("repu",
                "demo", "repu", "demo", "repu", "demo", "repu", "demo", "repu", "demo");

        var republicCount=0;
        var demoCount=0;


        for(int i=0;i< presidentList.size();i++){

            if(presidentList.get(i).equalsIgnoreCase("repu")){
                republicCount++;
            } else if (presidentList.get(i).equalsIgnoreCase("demo")) {
                demoCount++;
            }
        }
        System.out.println("republicCount= " + republicCount);
        System.out.println("demoCount = " + demoCount);


    }



}
