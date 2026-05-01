package basic.closures;


import java.util.function.Function;

interface Closure {
    String display(String str);
}

public class ClosureClassEx1 {


    // using interface
    private static String closureEx1(String value) {
        Closure closure = (str) -> {
            return "the value passed is -> " + str;
        };

        return closure.display(value);
    }

    // using Function

    static Function<String, String> displayString = (str) ->{
                return "the value passed is -> " + str;
    };


    public static void main(String[] args) {

        //System.out.println("method call -> " + closureEx1("shantanu"));


        // calling static function
        //System.out.println( displayString.apply("Shantanu"));

        Function<Integer, Integer> addItTo100 = (num) ->{
            return 100 + num;
        };

        System.out.println("add to 100" + addItTo100.apply(200));

    }


}


