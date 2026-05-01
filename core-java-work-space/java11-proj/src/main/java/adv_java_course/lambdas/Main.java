package adv_java_course.lambdas;

public class Main {


    public static void main(String[] args) {

        String msg= "hi there";

        Greetings greet = ((message) -> {
            System.out.println(message);
        } );

        greet.greetings(msg);
    }
}
