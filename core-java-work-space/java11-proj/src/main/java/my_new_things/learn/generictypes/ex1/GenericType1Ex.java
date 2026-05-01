package my_new_things.learn.generictypes.ex1;

import my_new_things.learn.generictypes.ex1.models.A;
import my_new_things.learn.generictypes.ex1.models.B;

public class GenericType1Ex {

    public static void main(String[] args) {

        A<String> a1= new A<>();
        B<Integer> b1= new B<>();

        a1.setAValue("some value");
        b1.setBValue(100);

        System.out.println("a value string is ..-> " +  a1.getAValue());
        System.out.println("b value int is ...-> " + b1.getBValue());

    }
}
