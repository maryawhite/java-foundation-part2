package com.mwhite;

import java.util.List;

/**
 * This example shows how you can find the minimum value in a list of numbers by first setting a variable to
 * a maximum value and then using a loop to compare that number to each number in the list,
 * For example, your list contains 25, 5, and 34. The variable is initially set to 2147483647 (Integer.MAX_VALUE).
 * 2147483647 is greater than 25 (true), so the new min is 25. The loop continues, 25 is greater than 5 so 5 becomes the new min,
 * the loop continues, 5 is not greater than 34 so 5 remains the min.
 * resources: https://www.techiedelight.com/find-min-max-value-unsorted-list-integers-java/
 */
public class FindMinValue {

    // Naive method to find the minimum value in an unsorted list in Java
    public static Integer getMin(List<Integer> list)
    {
        Integer min = Integer.MAX_VALUE;

        for (Integer num: list) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }
}
