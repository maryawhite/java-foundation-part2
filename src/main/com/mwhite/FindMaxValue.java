package com.mwhite;

import java.util.ArrayList;
import java.util.List;

//from https://www.techiedelight.com/find-min-max-value-unsorted-list-integers-java/
public class FindMaxValue {

    // Naive method to find the maximum value in an unsorted list in Java
    public static Integer getMax(List<Integer> list)
    {
        // initialize `max` to some minimum value
        Integer max = Integer.MIN_VALUE;

        // loop through every element in the list and
        // compare the maximum found so far with the current value
        for (Integer i: list)
        {
            // update max if found to be less than the current element
            if (max < i) {
                max = i;
            }
        }

        return max;
    }

        public static void main(String[] args) {
            List<Integer> aListOfNumbers = new ArrayList<>();
            aListOfNumbers.add(25);
            aListOfNumbers.add(5);
            aListOfNumbers.add(34);
            aListOfNumbers.add(13);
            aListOfNumbers.add(55);
            aListOfNumbers.add(2);

            System.out.println(getMax(aListOfNumbers));

        }


}
