package gr.aueb.cf.ch7;

/**
 * Checks greater than, less than in Strings. Ελέγχει ισότητα και μικρότερο μεγαλύτερο.
 */

public class StringCompare {

                public static void main(String[] args) {
                    String s1 = "Athens";
                    String s2 = "ATHENS";

                    if (s1.compareTo(s2) > 0) { // βάζω μικρότερο του 0 γιατί η equals αν ήταν ίσα θα επέστρεφε 0.
                        System.out.println("s1 > s2");
                    } else if ( s1.compareTo(s2) < 0) {
                        System.out.println("s1 < s2");
                    } else { // if s1.compareTo(s2) == 0
                        System.out.println("s1 equals s2");
        }

        if (s1.compareToIgnoreCase(s2) > 0) {
            System.out.println("s1 > s2");
        } else if ( s1.compareToIgnoreCase(s2) < 0) {
            System.out.println("s1 < s2");
        } else { // if s1.compareTo(s2) == 0
            System.out.println("s1 equals s2");
        }
    }
}
