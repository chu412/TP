package com.company;

public class U091WorkArray<T extends Number> {
    public T[] arrNums;

    public U091WorkArray(T[] numP) {
        arrNums = numP;
    }

    public double sum() {
        double DoubleWork = 0;
        for (T Item : arrNums) {
            DoubleWork += Item.doubleValue();
        }
        return DoubleWork;
    }


}
