package main.groovy.ifmo;

import java.math.BigDecimal;

public class JavaClass {
    void bigDecimal() {
        BigDecimal bigDecimal1 = new BigDecimal(21);
        BigDecimal bigDecimal2 = new BigDecimal(21);

        System.out.println("Big Decimal in Java");

        System.out.printf("bigDecimal1.equals(bigDecimal2) = %s\n", bigDecimal1.equals(bigDecimal2));
        System.out.printf("bigDecimal1 == bigDecimal2 = %s\n", bigDecimal1 == bigDecimal2);
        System.out.printf("bigDecimal1.compareTo(bigDecimal2) = %d\n", bigDecimal1.compareTo(bigDecimal2));
        System.out.printf("bigDecimal1.add(bigDecimal2) = %d\n", bigDecimal1.add(bigDecimal2).toBigInteger());
        System.out.printf("bigDecimal1.multiply(bigDecimal2) = %d\n", bigDecimal1.multiply(bigDecimal2).toBigInteger());
        System.out.printf("bigDecimal1.divide(bigDecimal2) = %d\n", bigDecimal1.divide(bigDecimal2).toBigInteger());
        System.out.println("Operators +, /, * is undefined for BigDecimal");
    }
}
