package com.example.arrays;

import java.util.Arrays;

public class Problem_1920 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.buildArray(new int[]{0, 2, 1, 5, 3, 4})));
    }

    static class Solution {
        public int[] buildArray(int[] nums) {
            final int n = nums.length;

            for (int i = 0; i < n; ++i)
                nums[i] += n * (nums[nums[i]] % n);

            for (int i = 0; i < n; ++i)
                nums[i] /= n;

            return nums;
        }
    }
}
