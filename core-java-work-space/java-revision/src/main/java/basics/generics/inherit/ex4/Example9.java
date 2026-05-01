package basics.generics.inherit.ex4;

public class Example9 {

    public static void main(String[] args) {

        ClassB<Integer, String> classB = new ClassB<>();

        classB.val1 ="";
        classB.val2 =100;

        // please be careful of ClassB types. <T1,T2> -> <T2, T1>
        ClassA<Integer, String > classA = new ClassB<String, Integer>();

        // check for order in which types are passed.
        ClassA<? extends Number, ? > classA1 = new ClassB<Object, Integer>();



    }
}
