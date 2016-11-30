package ua.in.sydoruk.oop.polymorphism;

public class PolymorphismTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.ride();
        car.ride(4);

        Vehicle motorbike = new Motorbike();
        motorbike.ride();
        motorbike.ride(2);

    }
}
