package gr.aueb.cf.ch18.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainList {


    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Athens");            // 0
        cities.add("New York");         // 1
        cities.add("Donostia");        // 2

        // Get
        String city = cities.get(0);        // Athens
        System.out.println("City: " + city);    // Athens


        // Set - Update
        int nyPosition = cities.indexOf("New York");
        if (nyPosition != -1) { // = -1  σημάινει ότι δε βρέθηκε. άρα εδώ έχω διάφορο -1.
            cities.set(nyPosition, "NY");
        } else {
            System.out.println("New York does not exist");
        }

        // contain - Remove
        if (cities.contains("Athens")) {
            cities.remove("Athens");
            System.out.println("Athens removed.");
        } else {
            System.out.println("Athens does not exist.");
        }

        // κάνω traverse.
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
            System.out.println("traversssse");
        }

        for (String el : cities) {
            System.out.println(el);
            System.out.println("el: str");
        }


        // iterator --> δείχνει απ το πρώτο στοιχέιο του cities.
        Iterator<String> iter = cities.iterator();
        while (iter.hasNext()) {  // εφόσον έχει επόμενο.
            System.out.println(iter.next()); // έτσι το καταναλώνω και το δείχνω.
        }

//        Iterator<String> it = cities.iterator();
//        while (it.hasNext()) {
//            if (it.next().equals("London")) {
//                it.remove();
//            }
//        }


        cities.removeIf(c ->c.equals("London.")); // --> διασχίζει, πιο σύγχρονο από το από πάνω., διαγράφει όλα τα στοιχεία που είναι London.
        cities.removeIf(C -> city.startsWith("A"));

//        cities.removeIf(C -> {
//                 return city.startsWith("A");
//                })

        cities.forEach(System.out::println); //  ή εδώ έχω lambda!! cities.forEach((el) -> System.out.println(el));

    }
}
