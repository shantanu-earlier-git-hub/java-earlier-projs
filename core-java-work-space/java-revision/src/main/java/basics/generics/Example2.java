package basics.generics;


public class Example2 {

    public static void main(String[] args) {

        // declaration of variable type generics
        // var, static , parameter , return type

        GenClass<Integer> gen1;
        GenClass<?> gen2;
        GenClass<? extends Number> gen3;
        GenClass<? super Number> gen4;

        //gen1 = new GenClass<Number>(); // error
        gen1 = new GenClass<Integer>(); // only integer works

        // any
        gen2 = new GenClass<Object>();
        gen2 = new GenClass<String>();
        gen2 = new GenClass<Integer>();
        gen2 = new GenClass<Double>();

        // only Number or extended type
        gen3 = new GenClass<Number>();
        gen3 = new GenClass<Integer>();
        gen3 = new GenClass<Double>();

        //gen3 = new GenClass<Object>(); // error

        gen4 = new GenClass<Number>();
        gen4 = new GenClass<Object>();

        //gen4 = new GenClass<Integer>(); // error as Integer is extended type not super type


        GenClass<Object> gen5;

        gen5 = new GenClass<Object>(); // specific type
        //gen5 = new GenClass<String>(); // error

        // diamond operator has to be used only with Specific Type
        // don't use with wild cards <?>


        // works from java 9 for anonymous class
        // but for java 8 new GenClass<Integer>() {} has to be provided.
        GenClass<Integer> gen6= new GenClass<>(){
            // anonymous class extends GenClass
        };

    }
}
