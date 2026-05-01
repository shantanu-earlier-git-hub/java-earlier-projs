package basics.generics;

/*
 when generics has been used with no Specific Type then it will be of type
 Object hence any value can be assigned but when want to assign that value to other
 variables then it gives compile error ....
*/

public class Example1 {

    public static void main(String[] args) {

        GenClass gen1= new GenClass();

        gen1.value =100;
        gen1.value ="";

        //int x = gen1.value;   /// compile error.

        GenClass<Integer> gen2= new GenClass();
        gen2.value =200;
        int y = gen2.value; // OK.


        GenClass<String> gen3= new GenClass();

        //gen3.value = 200; // compile error

        gen3.value = "value";
        String  z = gen3.value; // OK.

    }
}
