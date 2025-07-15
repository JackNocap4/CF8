package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει όλους τους ζυγούς αριθμούς από το 1 έως το 20.
 */
public class Askisi21 {

        public static void main(String[] args) {

            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

