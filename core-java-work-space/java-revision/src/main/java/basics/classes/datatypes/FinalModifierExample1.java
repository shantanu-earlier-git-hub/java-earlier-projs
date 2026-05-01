package basics.classes.datatypes;

public class FinalModifierExample1 {

    public static void main(String[] args) {

        final int x;

        x = 10; // works OK
        // but
        // x= 20 ; // doesn't work, once assigned cannot be changed.

        Dog dog = new Dog();
        //dog.name =""; doesn't work , same for instance variables.
        // instance variables not assigned to specific value will be assigned to default values if not final
        // like null , 0 , '' etc.
    }
}
