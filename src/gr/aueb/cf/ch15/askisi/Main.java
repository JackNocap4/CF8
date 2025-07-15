package gr.aueb.cf.ch15.askisi;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Ζώο", 5);
        Dog doggy = new Dog("Loupis", 3);
        Cat pussy = new Cat("PAOK", 2);

        System.out.println(animal);
        System.out.println(doggy);
        System.out.println(pussy);

        doSpeak(animal);
        doSpeak(doggy);
        doSpeak(pussy);
    }

    public static void doSpeak(Animal animal) { // εδώ είναι που βάζω το όνομα της κλάσης και μαλιστα τον Parent για να τα παρω ολα!
        animal.speak();
    }
}