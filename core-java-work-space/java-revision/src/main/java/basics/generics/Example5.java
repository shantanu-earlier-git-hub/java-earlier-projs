package basics.generics;


public class Example5 {

    public static void main(String[] args) {

        MultipleTypes<String , Integer> mt1=  new MultipleTypes<>();

        MultipleTypes<? , ?> mt2=  new MultipleTypes<String , Integer>();

        MultipleTypes<? , ? extends Number> mt3=  new MultipleTypes<String , Integer>();



    }
}
