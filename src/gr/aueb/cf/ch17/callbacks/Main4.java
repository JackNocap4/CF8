package gr.aueb.cf.ch17.callbacks;

public class Main4 {

    public static void main(String[] args) {

        doPrint(Main4::sayHelloWorld);   // η print καλεί μια άλλη μέθοδο στο σώμα της.
        doPrint(Main4::sayhelloCoding);

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

