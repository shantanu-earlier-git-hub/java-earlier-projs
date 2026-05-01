package basics.vectors;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> strVector = new Vector<>();

        strVector.add("123");
        strVector.add("456");


        System.out.println("strVector.toString() = " + strVector.toString());

        System.out.println("element at  0" + strVector.elementAt(0));

        strVector.removeAllElements();

        System.out.println("size = " + strVector.size());


    }
}
