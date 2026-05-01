package my_new_things.learn.generictypes.ex3;

public class Ex3 {

    public static void main(String[] args) {

        GenericTypeClass<Integer> gtc= new GenericTypeClass<Integer>();

        gtc.value=10;

        GenericTypeClass<Integer> gtc1= new GenericTypeClass<>();

        int [] items = {1,2,3,4};

        for(int item : items){

        }



    }
}
