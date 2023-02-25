package com.mwhite;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FindMaxValueTest {

    @Test
    public void getMaxTest() {
        List<Integer> aListOfNumbers = new ArrayList<>();
        aListOfNumbers.add(13);
        aListOfNumbers.add(55);
        aListOfNumbers.add(2);

        assertEquals(55, FindMaxValue.getMax(aListOfNumbers), 0.0);

    }
}