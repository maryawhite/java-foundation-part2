package com.mwhite.threadsExample;

//create a class that implements Runnable

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_RED + "Hello from Runnable.");
    }
}
