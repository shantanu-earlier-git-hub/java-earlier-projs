package basics.generics.inherit.ex3;

public class Example8 {

    public static void main(String[] args) {

        D<Double> d1= new D<>();

        d1.a = 10.34;
        d1.b =100;

        D<String> d2= new D<>();

        d2.a = "some value";
        d2.b =100;


        D<Character> d3= new D<>();

        d3.a = 'a';
        d3.b =100;



    }
}
