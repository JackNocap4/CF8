package gr.aueb.cf.ch6;

/**
 * Αντιγράφει τα περιεχόμενα των πινάκων
 * που στην περίπτωσή μας είναι primitives,
 * οπότε μιλάμε για deep copy.
 */
public class DeepArrayCopy {

    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3};
        int[] arrayCopy;


        arrayCopy= arrDeepCopy(initialArray);
        initialArray[0] = 100; // εδώ δεν επηρεάζει.

        for (int el : arrayCopy) {
            System.out.println(el + " ");
        }

        }

        public static int[] arrDeepCopy(int[] sourceArray) {
            int[] destinationArray = new int[sourceArray.length];

            for (int i = 0; i < sourceArray.length; i++) {
                destinationArray[i] = sourceArray[i];
            }
            return destinationArray;

        }
    }

