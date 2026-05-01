package basics.generics;


public class Example4 {

    public static void main(String[] args) {

        NumberOpClass<Number> num = new NumberOpClass<>(20);

        // below is allowed though the NumberOpClass as N extends Number <Type>
        NumberOpClass<? extends Object> num1 = new NumberOpClass<>(100l);// can cause errors later // misleading
        NumberOpClass<?> num2 = new NumberOpClass<>(200.00); // misleading can cause errors later
        var num3 = new NumberOpClass<>(300); // OK

        //num1.value =20; //value change not allowed readonly
        //num2.value =20; //value change not allowed readonly
        //num3.value =20; //value change not allowed readonly

        System.out.printf("? extends Object num ->  %d ", num1.value);
        System.out.printf("? num -> %d" , num2.value);
        System.out.printf("var  num -> %d" , num3.value);

        //num.doSomething(100); doesn't work
        System.out.println(num.value);

        num.doSomething(200); // integer
        num.doSomething(123.45); // double
        num.doSomething(200000l); // long
    }
}
