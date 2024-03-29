package com.mwhite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class introToLambda {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Printing from Runnable.")).start();

        Employee mary = new Employee("Mary Jones", 30);
        Employee charlie = new Employee("Charlie Brown", 21);
        Employee ada = new Employee("Ada Lovelace", 40);
        Employee grace = new Employee("Grace Hopper", 35);

        List<Employee> employees = new ArrayList<>();
        employees.add(mary);
        employees.add(charlie);
        employees.add(ada);
        employees.add(grace);

        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));
        for(Employee employee : employees) {
            System.out.println(employee.getName());
        }
        System.out.println("* * * *");
        for(Employee employee : employees) {
            System.out.println(employee.getName());
            new Thread(() -> System.out.println(employee.getAge())).start();
            //Note that this does print the ages, but in a strange order
            //the start method causes 2 threads to be running concurrently
        }

        System.out.println("- - - -");
        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });


    }

    static class Employee {
        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    //if you didn't use a lambda, you would have to create a class that implements the Runnable interface, Override the run method,
    //and instantiate/start it in the main method like below:

    //    public static void main(String[] args) {
//        new Thread(new CodeToRun()).start();
//    }
//
//    static class CodeToRun implements Runnable {
//        @Override
//        public void run(){
//            System.out.println("Printing from Runnable");
//        }
//    }
}

//from Java Masterclass by Tim Buchalka on Udemy
//Lamdas can only be used with interfaces that have only one method* that has to be implemented
//also referred to as functional interfaces
//the benefit is, you don't have to create a class that implements Runnable