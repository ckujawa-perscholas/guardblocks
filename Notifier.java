package com.perscholas.inclass.threading.concurrencyex1.guardedblocks;

public class Notifier implements  Runnable{

    private Message msg;

    public Notifier(Message m){
        this.msg = m;
    }

    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " started");
       try{
           Thread.sleep(1000);
        synchronized (msg){
           msg.setMsg(name + " Notifier work done");
//           msg.notify();
           msg.notifyAll();
       }
       } catch(InterruptedException e){
           e.printStackTrace();
       }
    }
}
