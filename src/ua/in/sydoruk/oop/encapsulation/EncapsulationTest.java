package ua.in.sydoruk.oop.encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Jack");
        user.setSurname("Smith");
        System.out.println("User name: " + user.getName());
        System.out.println("User surname: " + user.getSurname());
    }

}

class User {
    private String name;
    private String surname;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }
}
