package gr.aueb.cf.ch18.lifo_parking;

public class Main {
    public static void main(String[] args) {
        LifoParking parking1 = new LifoParking();

        parking1.addCar("ΙΚΑ1234");
        parking1.addCar("ΑΒΓ5678");
        parking1.addCar("ΧΨΖ9999");

        System.out.println("\nΑυτοκίνητα στο parking:");
        parking1.traverse();

        System.out.println("\nΑποχώρηση τελευταίου αυτοκινήτου:");
        parking1.removeCar();

        System.out.println("\nΑυτοκίνητα που έμειναν:");
        parking1.traverse();
    }
}
