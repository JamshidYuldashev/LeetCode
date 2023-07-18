package com.example.Problems;

import java.util.Arrays;

public class Problem_1470 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }

    static class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] result = new int[2*n];
            for (int i = 0; i < n; i++) {
                result[2 * i] = nums[i];
                result[2 * i + 1] = nums[n + i];
            }
            return result;
        }
    }
}
