package com.mwhite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class introToLambda {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Printing from Runnable.")).start();

        Employee mary = new Employee("Mary Jones", 30);
        Employee charlie = new Employee("Charlie Brown", 21);
        Employee layla = new Employee("Layla Clapton", 40);
        Employee sarah = new Employee("Sarah Green", 35);

        List<Employee> employees = new ArrayList<>();
        employees.add(mary);
        employees.add(charlie);
        employees.add(layla);
        employees.add(sarah);

        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));
        for(Employee employee : employees) {
            System.out.println(employee.getName());
        }
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