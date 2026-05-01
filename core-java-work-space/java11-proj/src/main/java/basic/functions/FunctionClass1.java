package basic.functions;

import java.util.function.Function;

public class FunctionClass1 {

    public static void main(String[] args) throws Exception {

        FunctionClass1 newClass= new FunctionClass1();

        String p1= "some";
        String p2= "Data";

        int val1= 20;
        int val2= 200;

        String conResult = newClass.myFunction(Display.class, funcPtr->funcPtr.display(p1,p2));
        long result = newClass.myFunction(Print.class, funcPtr->funcPtr.printMultiplication(val1,val2));

        System.out.println("concat ...  = " + conResult);
        System.out.println("multiply result ...  = " + result);
   }

    private <T,R> R myFunction(Class <? extends T> class1, Function<T,R> someFunction) throws Exception{
        T obj = class1.getConstructor().newInstance();
        return someFunction.apply(obj);
    }
}


