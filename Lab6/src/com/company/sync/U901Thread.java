package com.company.sync;

public class U901Thread extends Thread {
    public U901Bank bankWork;
    public int intTrans;
    public long lngSleep;

    public U901Thread(U901Bank BankWork, int trans, long LongSleep) {
        bankWork = BankWork;
        intTrans = trans;
        lngSleep = LongSleep;
    }

    public void run() {
        try {
            bankWork.calc(intTrans, lngSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
