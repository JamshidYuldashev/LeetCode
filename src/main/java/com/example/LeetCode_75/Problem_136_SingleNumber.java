package com.example.LeetCode_75;

import java.util.HashSet;

public class Problem_136_SingleNumber {
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
