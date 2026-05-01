package basics.generics.classes.methods;

public class ClassA<T>{

    T a ;

    // method type <T> can be different from class.

    static <T> T method1(T a){
        return null;
    }


    // better
    static <G> G betterType(G a){
        return null;
    }


}
