package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτελεί απλές αριθμητικές πράξεις (+, -, *, /) με χρήση switch.
 */
public class Askisi32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        char operator;
        double result;

        System.out.println("Δώστε τον 1ο αριθμό");
        a = scanner.nextInt();
        System.out.println("Παρακαλώ δώστε το 2ο αριθμό");
        b = scanner.nextInt();
        System.out.println("Παρακαλώ δώστε πράξη: /, *, +, -");
        operator = scanner.next().charAt(0);

        result = switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b != 0) {
                    yield a / b;
                } else {
                    System.out.println("Αδύνατον να διαιρεθεί με το μηδέν!");
                    yield 0;
                }
            }
            default -> {
                System.out.println("Άγνωστο σύμβολο λειτουργίας!");
                yield 0;  // Παρέχουμε ένα default αποτέλεσμα για το σφάλμα
            }
        }; System.out.printf("Αποτέλεσμα: %.2f\n", result);
    }

}
