package com.mwhite;

/** A prime number is a number that can only be divided by one and itself.
 * One is not a prime number because it has only one factor, namely 1.
 * Prime numbers need to have exactly two factors.
 * Return true if the number is prime. */
public class FindPrime {

    public boolean checkForPrime(int num) {
        boolean isPrime;
        if(num < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }

        for(int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        FindPrime findPrime = new FindPrime();
        System.out.println(findPrime.checkForPrime(2));
        System.out.println(findPrime.checkForPrime(5));
        System.out.println(findPrime.checkForPrime(7));
//        findPrime.checkForPrime(11);
//        findPrime.checkForPrime(6);
        System.out.println(findPrime.checkForPrime(8));


    }
}
