package gr.aueb.cf.ch2;

/**
 * Εμφανίζει την ημερομηνία με μορφή
 * dd/MM/yyyy
 */
public class DateApp {
    public static void main(String[] args) {
        int day = 2;
        int month = 4;
        int year = 2025;

        System.out.println("Η ημερομηνία είναι: " + day + "/" + month + "/" +year);
        System.out.printf("Η ημερομηνία είναι: %d/%2d/%d",day,month,year ); // το 2 πριν το d είναι για να αφήνει κενό

    }
}
