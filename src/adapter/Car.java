package adapter;

public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Going by Car..");
    }
}
