package gr.aueb.cf.ch2;

/**
* BigInteger class demo.
* */
import java.math.BigInteger;

public class BigIntApp {

    public static void main(String[] args) {
        BigInteger bigNum1 =  new BigInteger("123456789123456789");
        BigInteger bigNum2 =  new BigInteger("123456789123456789");
        BigInteger result;

        result = bigNum1.add(bigNum2);

        System.out.printf("result: %,d", result);


    }
}
