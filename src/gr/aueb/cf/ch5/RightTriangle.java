package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει 3 αριθμούς που αναπαριστούν
 * τις πλευρές ενός ορθογωνίου τριγώνου, έστω
 * a υποτείνουσα και b, c οι 2 κάθετες πλευρές
 * του τριγώνου. Και το πρόγραμμα ελέγχει αν το
 * τρίγωνο είναι ορθογώνιο. Ορθογώνιο είναι ένα
 * τρίγωνο που a*a = b*b + c*c
 */
public class RightTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.05; // το αυξομειώνω ανάλογα την ακρίβεια
        boolean isRight = false;

        System.out.println("Παρακαλώ είσάγετε το a, b, c (a η υποτείνουσα)");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        // Έλεγχος αν το τρίγωνο είναι ορθογγώνιο.
        isRight = (Math.abs(a * a - (b * b + c * c))) < EPSILON;

        System.out.println("Triangle is right: " + isRight);




    }
}

