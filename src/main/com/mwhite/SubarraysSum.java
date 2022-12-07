package com.mwhite;

import java.util.Scanner;

/** From HackerRank: A subarray is composed from a contiguous block of the original array's elements.
 * The sum of an array is the total sum of its elements: The sum is positive if the total sum is positive.
 * The sum is negative if the total sum is negative.
 * Given an array of n integers, find and print its number of negative subarrays on a new line.
 * Input: the first line contains a single integer, n, denoting the length of the array. The second line contains
 * the integers of the array.
 * For example,
 *  5
 *  1 -2 4 -5 1
 *
 *  Tip: When answering this question on HackerRank, do not include the System.out.println lines that I have here.
 *  */
public class SubarraysSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for the length of the array. ");
        int arrLength = scanner.nextInt();
        System.out.println("Enter the numbers you would like in the array. ");
        int[] numbersArray = new int[arrLength];
        for(int i = 0; i < arrLength; i++) {
            numbersArray[i] = scanner.nextInt();
        }

        int counter = 0;
        for (int i = 0; i < arrLength; i++) {
            int sum = numbersArray[i];
            if(sum < 0) {
                counter++;
            }
            for(int j = i + 1; j < arrLength; j++) {
                sum += numbersArray[j];
                if(sum < 0) {
                    counter++;
                }
            }
        }
        System.out.println("The number of negative subarrays is: " + counter);
    }
}
