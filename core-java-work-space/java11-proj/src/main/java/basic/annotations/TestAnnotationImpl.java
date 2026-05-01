package basic.annotations;

@TestAnnotations
public class TestAnnotationImpl {

    @TestAnnotations
    public int id ;


    @TestAnnotations
    public void someMethod(){
        System.out.println("displaying data" );
    }
}
