package com.mwhite.threadsExample;

//create a class that implements Runnable

import static com.mwhite.threadsExample.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from Runnable.");
    }
}
