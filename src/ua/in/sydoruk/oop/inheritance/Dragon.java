package ua.in.sydoruk.oop.inheritance;

class Dragon extends Animal implements Fly {
    @Override
    public void fly() {
        String dragonName = getName();
        System.out.println((dragonName != null ? dragonName : "NoNameDragon") + " flying ");
    }

    @Override
    String bark() {
        return "By";
    }
}
