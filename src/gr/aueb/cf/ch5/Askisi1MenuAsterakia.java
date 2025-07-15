package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Askisi1MenuAsterakia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;


        do {
            printMenu();
            System.out.print("Τι επιλέγεις: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.print("Δώστε αριθμό για αστεράκια: ");
                int n = scanner.nextInt();
                switch (choice) {
                    case 1 -> printStarsHorizontal(n);
                    case 2 -> printStarsVertical(n);
                    case 3 -> printSquareOfStars(n);
                    case 4 -> printIncreasingTriangle(n);
                    case 5 -> printDecreasingTriangle(n);
                }
            }else if (choice == 6) {
                System.out.println("'Εξοδος από το πρόγραμμα.");
            } else {
                System.out.println("Μη έγκυρη επιλογή.");
            }
        } while (choice != 6);


    }

    public static void printMenu() {
        System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Εμφάνισε τα αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

        public static void printStarsHorizontal ( int n){
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        public static void printStarsVertical ( int n){
            for (int i = 0; i < n; i++) {
                System.out.println("*");
            }
        }

        public static void printSquareOfStars ( int n) {
            for (int i = 0; i < n; i++) {
                printStarsHorizontal(n);
            }
        }

        public static void printIncreasingTriangle ( int n) {
            for (int i = 1; i <= n; i++) {
                printStarsHorizontal(i);
            }
        }
        public static void printDecreasingTriangle ( int n) {
            for (int i = n; i >= 1; i--) {
                printStarsHorizontal(i);
            }
        }
    }






