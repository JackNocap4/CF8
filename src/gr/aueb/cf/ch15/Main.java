package gr.aueb.cf.ch15;
/**
 * πολυμορφισμός.
 */

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Point[] points = new Point[] {
                new Point(1), new Point2D(2, 6), new Point3D(1, 8, 9), new Point3D(0, 4, 1)
        };

        for (Point point : points) {
            if (point instanceof Point3D) { // ελέγχουμε αν το object είναι του τύπου.
                System.out.println("Point 3D: " + point);
            } else if (point instanceof Point2D) {
                System.out.println("Point 2D: " + point);
            } else {
                System.out.println("Point : " + point);
            }
        }



        Point p1 = new Point(4);
        Point2D p2 = new Point2D(5, 8); //θα μπορούσε να είναι Point p2 =  new Point2D. cause Point2D is a point!
        Point3D p3 = new Point3D();

        p1.movePlusOne();
        p2.movePlusOne();
        p3.movePlusOne();

        doMovePlusOne(p3);
        doMovePlusOne(p2);
        doMovePlusOne(p1);

        System.out.println(p1); ///πρέπει να έχω μία toString στις κλάσεις. πρέπει να την έχω υπερκαλύψει. Γιατί από μόνη της δεν κάνει τπτ.
        System.out.println(p2);
        System.out.println(p3);
    }

    public static void doMovePlusOne(Point point) { // ως παράμετρο περνάω Point. Πολυμορφική. Μπορεί να πάρει πολλές μορφές.
        // παίρνει ως πραγματικη παράμετρο το όνομα κλάση και μετα ως instance βάζω οποιοδήποτε instance της κλάσης. εδω έβαλα το point.
        point.movePlusOne(); // επιλύεται σε run time. Λέγεται late-binding.
    }
}
