package gr.aueb.cf.ch17.callbacks;

public class Main {

    public static void main(String[] args) {

        doPrint(new Printable() {   //ανώνυμη κλάση. Στην ουσία είναι instance.
            @Override
            public void print() {

            }
        });

    }


    public static void doPrint(Printable printable) {
        printable.print();
    }
}
