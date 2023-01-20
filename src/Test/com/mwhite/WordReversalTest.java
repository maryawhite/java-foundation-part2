package com.mwhite;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class WordReversalTest {
    WordReversal wordReversal;

    @Before
    public void setUp() throws Exception {
        wordReversal = new WordReversal();
    }

    @Test
    public void reversePhraseTest() {
        assertEquals("last be will first", wordReversal.reversePhrase("first will be last"));
    }

    @Test
    public void shouldThrowErrorTest() {
        assertThrows(IllegalArgumentException.class, () -> wordReversal.reversePhrase(null));
    }

    //the lambda expression consists of 2 parts, the parameter list which is an empty list in this case
    // and the body of the lambda expression which calls the reversePhrase method with a null input
    // In this case, assertThrows is a method provided by Junit. It takes a functional interface as an argument,
    // which is a functional interface that has a single abstract method run that takes
    // no parameter and returns no value. The lambda expression is passed as an argument to
    // the method and the run method is executed.

    @Test
    public void shouldThrowErrorAltTest() {
        Exception exception = null;
        try {
            wordReversal.reversePhrase(null);
        } catch (Exception e) {
            exception = e;
        }
        assertTrue(exception instanceof IllegalArgumentException);
        assertTrue(exception.getMessage().contains("Input must be a String!"));
    }
}