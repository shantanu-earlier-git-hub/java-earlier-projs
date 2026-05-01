package my_new_things.learn.generictypes.ex2;

public class Ex2 {

    public static void main(String[] args) {
        AddClass<Integer> ac1 = new AddClass<>() {

            @Override
            Integer add(Integer val1, Integer val2) {
                return val1 + val2;
            }
        };

        System.out.println("adding int values -> " + ac1.add(100, 200));

    }

}
