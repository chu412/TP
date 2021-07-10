package com.company;

import java.util.Random;

public class U0901Main {
    public static void main(String[] args) {
        Integer[] intArr = {10, 20, 15};
        Float[] floatArr = new Float[3];
        for (int i = 0; i < 3; i++) {
            floatArr[i] = (float)(Math.random() * 10.0);
            System.out.println(floatArr[i]);
        }
        U091WorkArray<Integer> insWorkArrayInt = new U091WorkArray<>(intArr);
        U091WorkArray<Float> insWorkArrayFloat = new U091WorkArray<>(floatArr);

        System.out.println(insWorkArrayFloat.sum());
        System.out.println(insWorkArrayInt.sum());


    }
}
