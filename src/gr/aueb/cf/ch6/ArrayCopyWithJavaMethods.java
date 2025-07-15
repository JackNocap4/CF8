package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Array copy using utility classes and methods
 */
public class ArrayCopyWithJavaMethods {

    public static void main(String[] args) {

    }
    public static int [] addDeepCopy(int[] sourceArray) {
      //  int[] destinationArray = new int[sourceArray.length];


      //  System.arraycopy(sourceArray, 0, destinationArray, 2, sourceArray.length); //2η θέση είναι ο δείκτης. to 2o miden einai to index tou destination grafei ap ti 2.
        // ta 2 prota einai 0. tha dwsei dld 002

        int [] destinationArray;
        destinationArray = Arrays.copyOf(sourceArray, sourceArray.length);
        destinationArray = Arrays.copyOfRange(sourceArray, 0, sourceArray.length); // an valw 1 to size tou tha einai length -1 diladi legth - 2. O,TI KATALAVES SOS

        return destinationArray;
    }
}
