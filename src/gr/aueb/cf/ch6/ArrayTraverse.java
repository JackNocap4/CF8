package gr.aueb.cf.ch6;

/**
 * Διασχίζει έναν πίνακα. Δηλαδή επισκέπτεται
 * μία μία τις θέσεις του πίνακα και τυπώνει την
 * τιμή της κάθε θέσης.
 */
public class ArrayTraverse {

    public static void main(String[] args) {
        int[] arr1 = new int[5]; /// αν δε κάνω populate (δε δώσω τιμές) η default τιμή είναι το 0/
        int[] grades = {1, 2, 3, 4, 5};
        int[] arr3 = new int[] {2, 4, 6, 8, 10};

        // traverse with for
        for (int i = 0; i < arr1.length; i++) { // Ή <= arr1.length-1 αλλά δε συνηθίζεται.ΣΟΣ
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        // enhanced for
        for (int item : arr1) { // for item in arr1
            System.out.print(item + " ");
        }

        System.out.println();

        for (int grade : grades) {
            System.out.println(grade + " ");
        }
    }
}
