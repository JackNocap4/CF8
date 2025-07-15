package gr.aueb.cf.ch17.callbacks;

public class Main2 {

    public static void main(String[] args) {

        doPrint(()  -> System.out.println("Hello World"));   //lambda
        doPrint(()  -> System.out.println("Hello Coding")); // αν είναι μία εντολή δε χρειάζονται
    }


    public static void doPrint(Printable printable) {
        printable.print();
    }
}
