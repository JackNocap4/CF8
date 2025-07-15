package gr.aueb.cf.ch16.abstract_classes;

public class Cat extends Animal{

    public Cat() {
        super();
    }

    @Override
    public void speak() {
        System.out.println("Meow!!!");

    }

    public Cat(long id, String name) {
        super(id, name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Cat ate all her food.");
    }
}
