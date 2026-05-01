package basics.generics.inherit.ex1;

public class Example6 {

    public static void main(String[] args) {
        B<Integer> b1= new B<>();

        // works as A is specific type String
        // value is an attribute in A.
        b1.value = "some string";
    }
}
