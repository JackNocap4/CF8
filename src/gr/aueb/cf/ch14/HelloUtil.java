package gr.aueb.cf.ch14;

/**
 * Utility class. Provides sayHello
 * funtionality
 */
public class HelloUtil {

    /**
     * No instances of this class should be available.
     */
    private HelloUtil() { // πρέπει να γίνει ρητά private ο constructor.

    }

    public static void sayHello() {   // utility κλάση.
        System.out.println("Hello Coding");
    }
}
