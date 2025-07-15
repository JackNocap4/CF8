package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα 2 ακεραίων
 * με τη χρήση μεθόδων
 */

public class AddSubAppWithMethodsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int sum;
        int sub;

        System.out.println("Παρακαλώ εισάγετε 2 ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = add(num1, num2); // ivoke - call την add. Το πλήρες όνομα αν θέλω να το καλέσω από άλλη κλάση.
        sub = AddSubAppWithMethodsApp.sub(num2, num1); // διαφορετικά τα 2 subs. Το ένα είναι μέθοδος και το άλλο μεταβλητή.
                                                       // Από την ίδια κλάση μπορεί να παραληφθεί το πλήρες όνομα.

        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
    }
    /**
     *
     * @param a     the first integer to add.
     * @param b     the second integer to add
     * @return      the sum of a and b
     */

    public static int add(int a, int b) {
        return a + b; //πιο σύντομο από το κάτω.
    }

    /**
     *
     * @param a     the first integer to subtract from.
     * @param b     the second integer that is subtracted.
     * @return      the subtraction of a and b.
     */
    public static int sub(int a, int b) {
        return a - b; //πιο σύντομο από το κάτω.

    }
    //  public static int add(int a, int b) {
    //    int sum = 0;
      //  sum = a + b;
        //return sum;
    }


