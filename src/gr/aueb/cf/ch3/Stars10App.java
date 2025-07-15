package gr.aueb.cf.ch3;

/**
 * Εμφανίζει 10 οριζόντια αστεράκια
 * δηλαδή 1 αστεράκι 10 φορές.
 */
public class Stars10App {

    public static void main(String[] args) {

        int i = 1;
        int j = 10;

        while (i <= 10) {
            System.out.print("*");
            i++; // ή i +=1

        }

        while (j >= 1) {
            System.out.println("*");
            j--;
        }
    }
}
