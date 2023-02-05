package interfaces;

public class Animal {
    String name;

    public Animal() {
        this.name = "Bezimienny";
    }

    String showName() {
        return " zwierzę " + name;
    }

    String makeSound() {
        return "???";
    }

    void intorduce() {
        System.out.println("Jestem " + showName() + ":" + makeSound());
    }
}
