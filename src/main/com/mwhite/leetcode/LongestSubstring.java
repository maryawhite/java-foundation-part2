package com.mwhite.leetcode;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * i.e. given abcabcbb, the answer is 3 because the longest substring without repeating characters is abc, or bca, or cab which all have size 3
 */
public class LongestSubstring {

    //a relatively slow and inefficient method
    public int lengthOfLongestSubstring(String str) {
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            StringBuilder currentSubString = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                //indexOf will return -1 if the char doesn't exist. i.e. if the current substring is 'a' and j is 'b' then we'll get -1 because b does not exist in the current substring
                if (currentSubString.indexOf(String.valueOf(str.charAt(j))) != -1) {
                    break;
                }
                currentSubString.append(str.charAt(j));
                //Math.max will return whichever one is larger
                maxLength = Math.max(maxLength, currentSubString.length());
            }
        }
        return maxLength;
    }


    //an alternate method to solve the problem, using hash map
//    public int lengthOfLongestSubstringAlt(String str) {
//
//    }





    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();
        System.out.println("ls.lengthOfLongestSubstring(\"abcabcd\") = " + ls.lengthOfLongestSubstring("abcabcd"));
    }
}
