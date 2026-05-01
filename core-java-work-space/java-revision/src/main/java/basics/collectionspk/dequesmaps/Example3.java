package basics.collectionspk.dequesmaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example3 {

    public static void main(String[] args) {

        // HashMap no order guaranty ... no duplicate keys and overridden
//        Map<Integer, String> map1= new HashMap<>();

        // LinkedHashMap order is guaranty, but not sorted
        // no duplicate keys and overridden
        //Map<Integer, String> map1 = new LinkedHashMap<>();


        // sorted ... no duplicate keys and overridden
        Map<Integer, String> map1 = new TreeMap<>();

        map1.put(10, "ABC");
        map1.put(20, "PQR");
        map1.put(10, "WWW");
        map1.put(40, "XYZ");
        map1.put(25, "MNO");


        map1.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
