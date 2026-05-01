package basics.generics.interfaces;

public class Example1 {

    public static void main(String[] args) {

        I<Integer>  c1= new ClassC<Integer>();
        ClassC<String>  c2= new ClassC<>();

        int res = c1.m1();
        String res1= c2.m1();

        c1.m2(100);
        c2.m2("");

    }
}
