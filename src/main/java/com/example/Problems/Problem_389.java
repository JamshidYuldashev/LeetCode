package com.example.Problems;

public class Problem_389 {
    public static void main(String[] args) {
        System.out.println(new Solution().findTheDifference("abcc", "abcde"));
    }
    static class Solution {
        public char findTheDifference(String s, String t) {
            char ans = 0;

            for (final char c : s.toCharArray())
                ans ^= c;

            for (final char c : t.toCharArray())
                ans ^= c;

            return ans;
        }
    }
}
