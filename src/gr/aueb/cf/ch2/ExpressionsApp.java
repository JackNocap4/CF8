package gr.aueb.cf.ch2;

/** demo για παραστάσεις ακεραίων
 * αριθμητικών τελεστών
 */
public class ExpressionsApp {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 10;
        int sum = 0;
        int sub =0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        result1 = result1 +1;
        result2 = result2 +5;

        System.out.printf("sum: %d, sub: %d, mul: %d, div: %d, mod: %d\n", sum,sub,mul,div,mod);

        result1 += 12;
        result2 += 5;

        System.out.printf("Result1: %d, Result2: %d\n", result1, result2);

        result1++;
        result2--;
        ++result1;
        --result2;


        System.out.printf("Result1: %d, Result2: %d\n", result1, result2);

        result1 = num1++;    // result 25 num 26
        result2 = ++num2;    // result 11 num 11

        System.out.printf("Result1: %d, Result2: %d", result1, result2);







    }
}
