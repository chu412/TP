package com.company.sync;

public class U901Bank {
    public int intTo;
    public int intFrom = 220;

    public synchronized void calc(int intTransaction, long lngTimeout) throws InterruptedException {
        System.out.println("Before: " + Thread.currentThread().getName() + " current intTo:" + intTo + ", current intFrom:" + intFrom);
        intFrom -= intTransaction;
        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            System.out.println("I was interrupted!");
            e.printStackTrace();
        }
        intTo += intTransaction;
        System.out.println("After: " + Thread.currentThread().getName() + " current intTo:" + intTo + ", current intFrom:" + intFrom);

    }

}
