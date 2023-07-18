package com.example.Problems;

public class Problem_136 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int singleNumber(int[] nums) {
          int n = 0;
            for (int i : nums) {
                n ^= i;
            }
            return n;
        }
    }
}
