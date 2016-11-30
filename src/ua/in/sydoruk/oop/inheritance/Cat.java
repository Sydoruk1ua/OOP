package ua.in.sydoruk.oop.inheritance;

class Cat extends Animal {
    @Override
    String getName() {
        return super.getName();
    }

    @Override
    void setName(String name) {
        super.setName(name);
    }

    @Override
    String bark() {
        return "Meu Meu";
    }

}
