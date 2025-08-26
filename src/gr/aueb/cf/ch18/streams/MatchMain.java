package gr.aueb.cf.ch18.streams;

import java.util.List;

public class MatchMain {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Jimmy", "Lionel", "Denis");

        boolean isDenisExists = names.stream()
                .anyMatch(name -> name.equals("Denis"));        // για κάθε name ελέγχει αν υπάρχει Denis.

        boolean allAreDenis = names.stream()
                .allMatch(name -> name.equals("Denis"));        // αν είναι όλα Denis.


        boolean noneIsDenis = names.stream()
                .noneMatch(name -> name.equals("Denis"));       // αν δεν υπάρχει κανένας Denis είναι true.

        System.out.println("Υπάρχει Denis? " + isDenisExists);
        System.out.println("Είναι όλοι Denis? " + allAreDenis);
        System.out.println("Δεν υπάρχει κανένας Denis? " + noneIsDenis);
    }



}
