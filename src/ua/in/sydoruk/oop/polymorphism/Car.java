package ua.in.sydoruk.oop.polymorphism;

class Car implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Car is riding");
    }

    @Override
    public void ride(int numberOfWheels) {
        System.out.println("Car is rides on " + numberOfWheels + " wheels");

    }
}
