package basic.exceptions;

public class CheckException {

    void display(){

        int divider= 0;
        try {

            System.out.println( 100 / divider);
        }
        catch(CustomException ce){
            System.out.println("The exception is  = " + ce);
        }
        finally {
            divider =1;
        }
    }

    public static void main(String[] args) {
        new CheckException().display();
    }


}
