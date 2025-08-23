package gr.aueb.cf.ch18.lifo_parking;

import java.time.LocalDateTime;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Υλοποιεί τη λογική ενός parking με λογική lifo.
 * Last-In-First-Out.
 */
public class LifoParking {
    private final Deque<String> parking = new LinkedList<>();

    public LifoParking() {

    }

    // δίνω στους clients ένα public API για το parking.


    public List<String> getParking() {
        return List.copyOf(parking);
//        return Collections.unmodifiableList(parking);
    }

    public void addCar(String cardId) {             // cardId είναι πινακίδα αμαξιού.
        parking.push(cardId);
        System.out.println(LocalDateTime.now() + ", Αρ. Πινακίδας: " + cardId);
    }

    public String removeCar() {
        String carId = parking.pop();
        System.out.println(LocalDateTime.now() + ", Έξοδος, Αρ. Πινακίδας: " + carId);
        return carId;
    }

    public boolean isEmpty() {
        return parking.isEmpty();
    }

    public void traverse()  {
        parking.forEach(System.out::println);
    }
}
