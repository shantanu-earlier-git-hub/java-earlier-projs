package basics.generics.interfaces;

public class MethodLevelGenerics {

    <T> void m1() {

    }

    <T> T m2() {
        return null;
    }

    <T> T m3(T a) {
        return a;
    }

    <T1, T2> T1 m5(T2 a) {
        return null;
    }


    static <T> T m4(T a) {
        return a;
    }

    <T, G> T newMethod1(G a) {
        return null;
    }



    static <T> T getBean(String name, Class<T> c) {
        return null;
    }

    static Object getBean(String name) {
        return null;
    }


    public static void main(String[] args) {

        Integer b1  = getBean("b1" , Integer.class);
        Double b2  = getBean("b2" , Double.class);

        Double d = (Double) getBean("name");

    }





}
