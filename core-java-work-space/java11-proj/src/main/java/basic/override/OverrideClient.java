package basic.override;

public class OverrideClient {


    public static void main(String[] args) {

        Parent parent1= new Child1();
        Parent parent2= new Child2();

        parent1.display();
        parent2.display();



    }
}
