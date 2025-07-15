package gr.aueb.cf.ch17.callbacks;

public class Main3 {

    public static void main(String[] args) {

        doPrint(()  -> sayHelloWorld());   // η print καλεί μια άλλη μέθοδο στο σώμα της.
        doPrint(()  -> sayhelloCoding());
    }


    public static void doPrint(Printable printable) {
        printable.print();
    }

    public static void sayHelloWorld() {
        System.out.println("Hello World");
    }

    public static void sayhelloCoding() {
        System.out.println("Hello Coding");
    }
}
