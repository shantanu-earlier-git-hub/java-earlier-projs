package hackrank.week2;

import java.util.List;

public class LonelyInteger {


    public static int lonelyinteger(List<Integer> a) {

        int out =0;
            for( Integer val : a){
                //System.out.println(val);
                var a1=  a.subList(a.indexOf(val) + 1 , a.size());
                //System.out.println(a1);
                if(! a1.contains(val)){
                    out = val;
                    break;
                }
            }

            return out;

    }

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,3,2,1);

        System.out.println(" the output" + lonelyinteger(list));
    }
}

