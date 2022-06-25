package com.mwhite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class introToLambdaPt2 {

    public static void main(String[] args) {

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
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + " " + s2.toUpperCase();
        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }

}
    class Employee {
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

    interface UpperConcat {
        public String upperAndConcat(String s1, String s2);
    }


//from Java Masterclass by Tim Buchalka on Udemy