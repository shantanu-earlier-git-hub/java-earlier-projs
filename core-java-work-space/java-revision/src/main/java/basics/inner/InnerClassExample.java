package basics.inner;

public class InnerClassExample {

    static int valueB;
    int value;

    static class B {

        static int methodB() {
            valueB = 100;
            return valueB;
        }
    }

    class A {
        int methodA() {
            value = 10;
            return value;
        }
    }


}



