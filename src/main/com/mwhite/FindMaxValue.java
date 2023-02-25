package com.mwhite;

import java.util.List;

/**
 * This example shows how you can find a maximum value in a list of numbers by first setting a variable to
 * a minimum value and then using a loop to compare that number to each number in the list,
 * For example, your list contains 13, 55, and 2. The variable is initially set to -2147483648 (Integer.MIN_VALUE).
 * -2147483648 is less than 13 (true), so the new max is 13. The loop continues, 13 is less than 55 so 55 becomes the new max,
 * the loop continues, 55 is not less than 2 so 55 remains the max.
 * resources: https://www.techiedelight.com/find-min-max-value-unsorted-list-integers-java/
 */
public class FindMaxValue {

    // Naive method to find the maximum value in an unsorted list in Java
    public static Integer getMax(List<Integer> list)
    {
        Integer max = Integer.MIN_VALUE;

        for (Integer num: list) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}
