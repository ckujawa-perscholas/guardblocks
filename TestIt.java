package com.perscholas.inclass.threading.concurrencyex1.guardedblocks;

public class TestIt {

    public static void main(String[] args){
        Message msg = new Message("Pre-processing");
        Waiter waiter = new Waiter(msg);
        Waiter waiter1 = new Waiter(msg);
        Notifier notifier = new Notifier(msg);


        new Thread(waiter, "waiter").start();
        new Thread(waiter1, "waiter1").start();
        new Thread(notifier, "notifier").start();

        System.out.println("All the threads are started");
    }
}
