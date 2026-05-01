package basics.generics.inherit.ex2;

public class Example7 {

    public static void main(String[] args) {
        B<Integer> b1= new B<>();

        //b1.value = "some string"; // error

        b1.value =100 ;// works as here instance of B is Integer and A has been type of B.
    }
}
