package com.mwhite.lambdaExpressionf;

public class SimpleExample {
    public static void main(String[] args) {
        String name = "JavaCodeGeeks team";

        SimpleExampleInterface a = new SimpleExampleInterface() {
            @Override
            public void data() {
                System.out.println(name + " says Hello!");
            }
        };
        a.data();

        //Note how much we can shorten the code using a lambda expression:
        SimpleExampleInterface b = () -> System.out.println(name + " says hello!!");
        b.data();
    }
}
