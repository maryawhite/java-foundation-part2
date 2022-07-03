package com.mwhite.threadsExample;

//from Tim Buchalka Java Masterclass on Udemy

import static com.mwhite.threadsExample.ThreadColor.ANSI_GREEN;
import static com.mwhite.threadsExample.ThreadColor.ANSI_PURPLE;

public class ThreadsEx {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the Main Thread threadsEX.");
        Thread threadsSubclass = new threadSubclass();
        //use the start method to run that thread:
        threadsSubclass.start();

        System.out.println("Hello again from the Main Thread threadsEX. You might see this in a different order each time.");
        //you can't start the same instance of a thread more than once.
//        threadsSubclass.start(); //This would cause an Illegal Thread State Exception

        //if you use an anonymous class, you must start the thread immediately.

        //create a thread that's an anonymous class
        new Thread() {
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the anonymous class.");
            }
        }.start();

        //create an instance of myRunnable
        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        //Interrupt-You can interrupt a thread to terminate it
//        threadsSubclass.interrupt(); you'll need a return statement in the catch block of the class

    }

}

//from Tim Buchalka Java Masterclass on Udemy
//why use runnable rather than subclassing?
// Many people use Runnable because it's more convenient and there are many methods that want a Runnable instance passed to them.
//A thread will terminate when it returns from it's run method. Either explicity because it executes it's return statement or implicitly when it reaches it's end.
//A common mistake is to call the run method instead of the start method. You implement the run method, but don't call it directly.
// there's also a .join() method