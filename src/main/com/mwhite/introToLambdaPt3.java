package com.mwhite;

import java.util.ArrayList;

public class introToLambdaPt3 {

    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("chicken");
        shoppingList.add("milk");
        shoppingList.add("carrots");
        shoppingList.add("bread");

        //normally you might use a for loop to print each item on your list, but you can use a lambda
        shoppingList.forEach((n) -> System.out.println(n));

        //Note: IntelliJ recommends a method reference: shoppingList.forEach(System.out::println);


    }

}

// lambdas can have zero or more parameters, and returns a value
// (parametesr) -> expression (body)
// from John M. on Java Code Geeks on Youtube https://youtu.be/5FkmiqGlcYY
