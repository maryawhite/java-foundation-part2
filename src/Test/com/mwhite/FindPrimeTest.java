package com.mwhite;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindPrimeTest {

    @Test
    public void checkForPrimeTrueTest() {
        FindPrime findPrime = new FindPrime();
        assertTrue(findPrime.checkForPrime(79));
        assertTrue(findPrime.checkForPrime(2));
    }

    @Test
    public void checkForPrimeFalseTest() {
        FindPrime findPrime = new FindPrime();
        assertFalse(findPrime.checkForPrime(51));
        assertFalse(findPrime.checkForPrime(966));
    }
}
