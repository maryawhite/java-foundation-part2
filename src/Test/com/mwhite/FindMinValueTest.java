package com.mwhite;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FindMinValueTest {

    @Test
    public void getMinTest() {
        List<Integer> aListOfNumbers = new ArrayList<>();
        aListOfNumbers.add(5);
        aListOfNumbers.add(34);
        aListOfNumbers.add(55);
        aListOfNumbers.add(2);

        assertEquals(2, FindMinValue.getMin(aListOfNumbers), 0.0);
    }
}