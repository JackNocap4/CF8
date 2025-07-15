package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Απλός αριθμητικός υπολογιστής με μεθόδους.
 */
public class Calculator {
    static Scanner scanner = new Scanner(System.in); //είναι global μέθοδος, είναι έξω από τη main. τι scope έχει η μεταβλητη.

    public static void main(String[] args) {
        int choice; // αυτό είναι ορατό στο block και στα υποblock.
        int result;

        while (true) {
            printMenu(); // δείχνει το menu
            choice = getOneInt(); // πάρε την επιλογή.

            if (!isChoiceValid(choice)) { // ! = not
                System.out.println("Λάθος επιλογή. Η επιλογή πρέπει αν είναι μεταξύ 1-6. Προσπαθήστε ξανά");
                continue;
            }

            if (isChoiceExit(choice)) {
                System.out.println("Έξοδος...");
                break;
            }

           result = getResultBasedOnChoice(choice);
            printTheResultToStdOut(result);

        }
    }

    public static void printMenu() { // void γιατί δεν εξαρτάται από μία τιμή εισόδου
        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιαμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο Διαίρεσης");
        System.out.println("6. Έξοδος");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        // if (choice >= 1 && choice <=6) {
        // return true;
        // } else {
        // return false;
        // }

        return choice >= 1 && choice <= 6;
    }

    public static boolean isChoiceExit(int choice) {
        return choice == 6;
    }

    public static int getResultBasedOnChoice(int choice) {
        int num1;
        int num2;

        System.out.println("Παρακαλώ εισάγετε 2 ακεραίους");
        num1 = getOneInt();
        num2 = getOneInt();

        return switch (choice) { // switch expression  Υπονοείται ότι θα γίνει return το αποτέλεσμα της switch.
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mul(num1, num2);
            case 4 -> div(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0;
        }; // βάζω ; γτ επιστρέφει κάτι. είναι expression

       /*return switch (choice) {
           case 1 -> num1 + num2;   παραλέιπω το yield γτ έχω μόνο μία εντολή
        }
        case 2 -> {
           yield num1 - num2;
        }
        case 3 ->{
            num1 * num2;
        }
        case 4 -> {
           if (num2 == 0) yield 0;
           yield num1 % num2;
        }
        default -> 0;*/

        //switch (choice) {
        //  case 1 :
        //      result = add(num1, num2);
        //    break;
        // case 2 :
        //    result = sub(num1, num2);
        //      break;
        //    case 3 :
        //      result = mul(num1, num2);
        //    break;
        //  case 4 :
        //    result = div(num1, num2);
        //     break;
        //   default:
        //    System.out.println("Λάθος επιλογή");
        //    break;
        //  }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        //  if ( b == 0) return 0;
        //   return a / b;
        return (b == 0) ? 0 : a / b;
    }

    public static int mod(int a, int b) {
        return (b == 0) ? 0 : a % b;
    }
    public static void printTheResultToStdOut(int result) {
        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}

