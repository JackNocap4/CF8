package gr.aueb.cf.ch2;
/*
* typecast demo
 */
public class TypecastApp {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L; // type suffix

        num1 =(int) num2;

        System.out.println(num1);

    }
}
