package basics.classes;

public class SimpleClass {

    int index = 0;

    // order is initializing block , constructor and main method...

    {
        index = 100;
        System.out.println("index = " + index);
    }

    public SimpleClass() {
        this.index = 200;
    }


    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass();
        System.out.println("simpleClass.index = " + simpleClass.index);
    }

}
