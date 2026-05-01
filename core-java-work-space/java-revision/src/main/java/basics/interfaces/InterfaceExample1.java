package basics.interfaces;


@FunctionalInterface
interface Functional {
    String getName(String name);
}

interface Demo {

    static void display() {
        System.out.println("called static method display");
    }

    void method1(String message);

    default void method2(Integer val) {
        System.out.println("value passed is " + val);
    }
}

interface NextDemo extends Demo {
    default void method1(String name) {
        System.out.println("override method 1 from Demo class ");
    }

}

public class InterfaceExample1 implements NextDemo {

    public static void main(String[] args) {
        new InterfaceExample1().method1("calling from class instance");
        NextDemo ex1 = new InterfaceExample1();
        ex1.method1("calling from interface handle");
        ex1.method2(200);
        demoOne();
        Demo.display();

        Functional func = (name) -> "hi" + name;

        System.out.println(func.getName("shan"));

    }

    private static void demoOne() {
        NextDemo ex1 = new InterfaceExample1();
        ex1.method2(300);
        Demo.display();
    }

    @Override
    public void method1(String message) {
        System.out.println(message);
        NextDemo ex1 = new InterfaceExample1();
        ex1.method2(100);
        Demo.display();
    }
}




