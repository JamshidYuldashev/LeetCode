package com.example.arrays;

import java.util.Arrays;

public class Problem_1929 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().getConcatenation(new int[]{1, 2, 1})));
    }

    static class Solution {
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n*2];

            for (int i = 0; i < n; ++i) {
                ans[i] = ans[i + n] = nums[i];
            }
            return ans;
        }
    }
}
