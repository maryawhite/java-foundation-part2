package com.mwhite;

import java.util.Arrays;
import java.util.Collections;

/**
 * Given a string of words reverse the order of the words.
 * i.e. "dog bites man", would become "man bites dog"
 * Bonus: Make the first letter capital and add punctuation to the end.
 */
public class WordReversal {

    public String reversePhrase(String input) {

        if(input == null){
            throw new IllegalArgumentException("Input must be a String!");
        }

        String[] splitted = input.split(" ");
        Collections.reverse(Arrays.asList(splitted));
        String rejoined = String.join(" ", splitted);

        System.out.println(rejoined);
        return rejoined;
    }

    public static void main(String[] args) {
        WordReversal wordReversal = new WordReversal();
        wordReversal.reversePhrase("dog bites man");
        wordReversal.reversePhrase("first will be last");
        wordReversal.reversePhrase(null);
    }
}
