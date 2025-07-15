package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FahrenheitCelcius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int celcius = 0;
        int fahr = 0;

        System.out.println("Παρακαλώ εισάγετε μία θερμοκρασία (ακέραιο)");
        fahr = in.nextInt();

        celcius = (int) ((5.0/9)* (fahr-32));

        System.out.printf("Οι θερμοκρασία των %d βαθμών σε Fahrenheit είναι %d Κελσίου", fahr,celcius);



    }
}
