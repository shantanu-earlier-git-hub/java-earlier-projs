package basics.inner;

public class InnerClassExample1Client {


    public static void main(String[] args) {
        InnerClassExample innerClassExample = new InnerClassExample();
        InnerClassExample.A a = innerClassExample.new A();

        System.out.println(a.methodA());
        System.out.printf("method value %d -> ", InnerClassExample.B.methodB());
    }
}
