package basics.array;

public class VarargsExample1 {


    public static void main(String[] args) {

        m1();
        m1(1);
        m1(2, 3, 7, 4, 5, 4);

        m2(1, 2, 3, 4, 5);

    }

    static private void m1(int... a) {
        for (int y : a) {
            System.out.println(y);
        }
        System.out.println(a.length);
    }


    //  m2(int[]... x) //  OK
    //  m2(int... val, int... x) // doesn't compile
    //  m2(String/ char or any other datatype... val, int... x) // doesn't compile
    //  m2(int... []x) // doesn't compile

    // following is OK. varargs should be end of the parameter of function.
    // first value will be assigned to int in this case and others if provided assigned to x
    static private void m2(int val, int... x) {

        for (int i : x) {
            System.out.println("i = " + i);
        }
    }
}
