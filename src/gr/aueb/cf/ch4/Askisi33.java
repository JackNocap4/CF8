package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ελέγχει αν ένας ελληνικός χαρακτήρας είναι φωνήεν.3.3 Αναπτύξτε ένα πρόγραμμα που λαμβάνει από τον χρήστη ένα
 * χαρακτήρα ελληνικό και ελέγχει (επιστρέφει true ή false) αν είναι
 * φωνήεν με τη χρήση της καινούργιας switch/case. Χρησιμοποιήστε
 * την Character.toUpperCase(ch) για να κάνετε normalize σε upper
 * case τους χαρακτήρες που δίνει ο χρήστης και να συγκρίνετε στην
 * switch / case με upper case
 */
public class Askisi33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar;
        char ch;

        System.out.println("Παρακαλώ δώστε έναν χαρακτήρα");
        inputChar = scanner.nextLine().charAt(0);
        ch = Character.toUpperCase(inputChar);
        boolean isVowel;

        switch (ch) {
            case 'Α', 'Ε', 'Η', 'Ι', 'Ο', 'Υ', 'Ω' -> isVowel = true;
            default -> isVowel = false;
        }
        System.out.println("Είναι φωνήεν: " + isVowel);
    }
}
