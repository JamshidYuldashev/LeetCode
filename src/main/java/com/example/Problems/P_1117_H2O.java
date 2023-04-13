package com.example.Problems;

class P_1117_H2O {

    private int hCount;

    public P_1117_H2O() {
        this.hCount = 0;
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        synchronized (this) {
            while (hCount == 2) {
                wait();
            }
            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            releaseHydrogen.run();
            hCount++;
            notifyAll();
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        synchronized (this) {
            while (hCount < 2) {
                wait();
            }
            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();
            hCount = 0;
            notify();
        }
    }
}
