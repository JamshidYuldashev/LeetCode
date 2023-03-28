package com.example.Problems;

import java.util.Arrays;

public class Problem_2255 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int countPrefixes(String[] words, String s) {
            return (int) Arrays.stream(words).filter(word -> s.startsWith(word)).count();
        }
    }
}
