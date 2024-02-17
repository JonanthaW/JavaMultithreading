package org.example;

public class Multithreading implements Runnable {

    private int threadNumber;
    public Multithreading (int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " From thread number " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {}
        }
    }
}
