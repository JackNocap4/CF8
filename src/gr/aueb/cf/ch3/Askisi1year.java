package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Askisi1year {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.print("Εισάγετε ένα έτος: ");
        year = scanner.nextInt();
        boolean isDouble = false;

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isDouble = true;
            }else {
                if (year % 400 == 0) {
                    isDouble = true;
                }
            }
        }
        if (isDouble == true) {
            System.out.println(year + " είναι δίσεκτο έτος.");
        } else {
            System.out.println(year + " δεν είναι δίσεκτο έτος.");
        }
        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή μας!");

    }
    }