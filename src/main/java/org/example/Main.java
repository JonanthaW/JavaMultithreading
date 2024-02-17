package org.example;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Multithreading thread = new Multithreading(i);
            Thread myThread = new Thread(thread);
            myThread.start();
            /*try {
                myThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}