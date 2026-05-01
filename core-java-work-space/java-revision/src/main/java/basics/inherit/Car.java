package basics.inherit;

public class Car extends Vehicle {

    public static void main(String[] args) {
        new Car().addChassis();
    }

    @Override
    public void addChassis() {
        super.addChassis();
        System.out.println(" added Chassis of car");
    }


}
