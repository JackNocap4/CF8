package gr.aueb.cf.ch16;

public class Main {

    public static void main(String[] args) {
        Ispeakable alice = new Cat("Alice");
        Ispeakable bob = new Dog("Bob", 2);

        alice.speak();
        bob.speak();

        doSpeak(alice);
        doSpeak(bob);

    }

    public static void doSpeak(Ispeakable iSpeakable) {
        iSpeakable.speak();
    }
}