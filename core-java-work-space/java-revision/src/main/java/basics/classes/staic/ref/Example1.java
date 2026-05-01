package basics.classes.staic.ref;

public class Example1 {

    public static void main(String[] args) {

        Car c = null;

        //c.model =2023; // instance variable cannot be accessed like this it has to be c = new Car()

        // but static method or variable can be accessed using class ref. no need to instance created.
        c.whatModel(20);

    }
}
