package com.company.sync;

public class U901Main {
    public static void main(String[] args) {
        U901Bank bankMain = new U901Bank();
        U901Thread threadOne = new U901Thread(bankMain, 100, 2000);
        threadOne.setName("First");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        threadOne.start();
        System.out.println(bankMain.intTo + " " + bankMain.intFrom);

        U901Thread threadTwo = new U901Thread(bankMain, 50, 300);
        threadTwo.setName("Second");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        threadTwo.start();
        System.out.println(bankMain.intTo + " " + bankMain.intFrom);

        System.out.println(Thread.currentThread().getName());
    }

}
