package ua.in.sydoruk.oop.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Animal animalCat = new Cat();
        animalCat.setName("Barsik");
        Animal animalDog = new Dog();
        animalDog.setName("Rex");
        System.out.println(animalCat.getName() + " says: " + animalCat.bark() );
        System.out.println(animalDog.getName() + " says: " + animalDog.bark() );

        Animal animalDragon = new Dragon();
        animalDragon.setName("George");
        Fly dragon = (Dragon) animalDragon;
        dragon.fly();

    }
}
