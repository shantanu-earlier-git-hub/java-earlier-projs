package basic.collections.stack;

import java.util.Iterator;
import java.util.Optional;
import java.util.Stack;

public class StackExamp {


    private static Optional getArrayData(){
        return Optional.of(new int[2]);
    }

    public static void main(String[] args) {

        Stack<Integer> intStack = new Stack<>();
        Optional arrayData = getArrayData();

        for (int i = 0; i < 10; i++) {
            intStack.push(i * 2);
        }

        //intStack.forEach(System.out::println);

        Iterator it = intStack.iterator();

        while (it.hasNext()) {
            System.out.println("val= " + intStack.pop());
        }

    }
}
