package com.mwhite.threadsExample;

//Create a class that extends the Thread class, and override the run method
public class threadSubclass extends Thread {
    @Override
    public void run(){
        System.out.println(ThreadColor.ANSI_BLUE + "Hello from another thread, threadSubclass.");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ThreadColor.ANSI_BLUE + "Another thread woke me up. The exception will be called if another method interrupts this.");
            return; //this will terminate the thread instance when it's interuppted.
        }
        System.out.println(ThreadColor.ANSI_BLUE + "Three seconds have passed and I'm awake.");
    }
}
