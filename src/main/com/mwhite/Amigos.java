package com.mwhite;

import java.util.ArrayList;
import java.util.List;

//from AmigosCode on Youtube
public class Amigos {
    //in psvm, create a list of persons
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Mary", Gender.FEMALE),
                new Person("Ava", Gender.FEMALE),
                new Person("Grace", Gender.FEMALE),
                new Person("Tim", Gender.MALE),
                new Person("Charlie", Gender.MALE)
        );

        System.out.println("* Imperative Approach *");
        // The imperative approach, how many females are in our list
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("* Declarative Approach *");
        // Declarative Approach
        people.stream()
                .filter((Person person) -> Gender.FEMALE.equals(person.gender))
                .forEach(System.out::println);
    }

    //create a person class with 2 properties, a constructor, and a toString method.
    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    //create an enum with 2 constants
    enum Gender {
        MALE, FEMALE
    }
}
//from AmigosCode on Youtube
//lambdas, () ->, and stream(), were introduced in Java 8
//A Stream can replace a for loop because they allow for the processing of a sequence of data
//filter can be used to filter out information similar to the if statement.
//then we use a forEach to loop through the results and print them out
// :: is called a method reference. Class::Method System.out is the class, and println is the method being called
//Notice that the Declarative Approach is accomplished in fewer lines of code

