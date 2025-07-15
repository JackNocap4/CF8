package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 * Char input a byte (latin)
 */
public class CharInput {

    public static void main(String[] args) throws IOException {
        int inputChar = ' ';

        System.out.println("Παρακαλώ εισάγετε έναν χαρακτήρα");
        inputChar = System.in.read();

        System.out.println("Char: " + (char) inputChar);

    }
}
