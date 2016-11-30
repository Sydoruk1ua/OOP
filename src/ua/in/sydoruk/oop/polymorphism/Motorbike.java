package ua.in.sydoruk.oop.polymorphism;

class Motorbike implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Motorbike is riding");
    }

    @Override
    public void ride(int numberOfWheels) {
        System.out.println("Motorbike is rides on " + numberOfWheels + " wheels");
    }
}
