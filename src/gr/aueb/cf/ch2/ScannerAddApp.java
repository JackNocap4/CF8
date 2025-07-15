package gr.aueb.cf.ch2;
import java.util.Scanner;

/*
* διαβάζει 2 ακεραίους απο τον
* stdin (πληκτρολόγιο) και δίνει το αποτέλεσμα
*
 */
public class ScannerAddApp {
    public static void main(String[] args) {
        // δήλωση και αρχικοποίηση μεταλητών
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Παρακαλώ εισάγετε 2 ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        System.out.printf("Το άθροισμα %d και %d είναι ίσο με %d", num1,num2,sum);



    }

}
