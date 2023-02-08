package com.mwhite;

import java.util.ArrayList;
import java.util.List;

//from https://www.techiedelight.com/find-min-max-value-unsorted-list-integers-java/
public class FindMinValue {

    // Naive method to find the minimum value in an unsorted list in Java
    public static Integer getMin(List<Integer> list)
    {
        // initialize `min` to some maximum value
        Integer min = Integer.MAX_VALUE;

        // loop through every element in the list and
        // compare the minimum found so far with the current value
        for (Integer i: list)
        {
            // update min if found to be more than the current element
            if (min > i) {
                min = i;
            }
        }

        return min;
    }


    public static void main(String[] args) {
        List<Integer> aListOfNumbers = new ArrayList<>();
        aListOfNumbers.add(25);
        aListOfNumbers.add(5);
        aListOfNumbers.add(34);
        aListOfNumbers.add(13);
        aListOfNumbers.add(55);
        aListOfNumbers.add(2);

        System.out.println(getMin(aListOfNumbers));

    }

}
