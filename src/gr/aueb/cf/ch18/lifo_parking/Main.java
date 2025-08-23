package gr.aueb.cf.ch18.lifo_parking;

public class Main {
    public static void main(String[] args) {
        LifoParking parking = new LifoParking();

        parking.addCar("ΙΚΑ1234");
        parking.addCar("ΑΒΓ5678");
        parking.addCar("ΧΨΖ9999");

        System.out.println("\nΑυτοκίνητα στο parking:");
        parking.traverse();

        System.out.println("\nΑποχώρηση τελευταίου αυτοκινήτου:");
        parking.removeCar();

        System.out.println("\nΑυτοκίνητα που έμειναν:");
        parking.traverse();
    }
}
