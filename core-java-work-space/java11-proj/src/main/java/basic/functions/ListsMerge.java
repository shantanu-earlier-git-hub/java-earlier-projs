package basic.functions;

import java.util.ArrayList;
import java.util.Arrays;

public class ListsMerge {

    public static void main(String[] args) {

    }


    private static void mergeLists(){

        ArrayList<Integer> list1= (ArrayList<Integer>) Arrays.asList(1,2,3,4,5);
        ArrayList<Integer> list2= (ArrayList<Integer>) Arrays.asList(6,7,8,9,10);


        list1.addAll(list2);



    }

}
