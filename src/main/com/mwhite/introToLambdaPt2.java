package com.mwhite;

public class introToLambdaPt2 {

    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

//Remember: //Lamdas can be used with interfaces that have only one method* that has to be implemented
interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething() {
        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expressions class is " + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
        //the lambda isn't a class, the lambda is treated like a nested block of code and has the same scope as a nested block
        return introToLambdaPt2.doStringStuff(uc,"String1", "String2");
    }
}


//from Java Masterclass by Tim Buchalka on Udemy