package basics.generics;


public class Example3 {

    public static void main(String[] args) {


        GenClass<?> gen7 = new GenClass<Integer>();
        //gen7.value = Integer.valueOf(100); // this doesn't work

        // this will work works only through constructor.
        // before creating instance the type has been provided hence it will compile and work
        GenClass<?> gen8 = new GenClass<>(100);
        //gen8.value =200; // error , treated as final  and cannot be modified , read only.

        // for diamond operator no primitives are allowed , only wrapper classes
        System.out.println(gen8.value.getClass());

        GenClass<?> gen9 = new GenClass<>("some value");
        System.out.println(gen9.value.getClass());

        GenClass<?> gen10 = new GenClass<>(new Object());
        System.out.println(gen10.value.getClass());

    }
}
