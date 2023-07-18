package com.example.Problems;

import java.util.Arrays;

public class Problem_1991 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMiddleIndex(new int[]{1,7,3,6,5,6}));
    }
    public static class Solution {
        public int findMiddleIndex(int[] nums) {
            int left = 0;
            int right = Arrays.stream(nums).sum();
            for (int i = 0; i < nums.length; ++i) {
                right -= nums[i];

                if (left == right) {
                    return i;
                }
                left += nums[i];
            }
            return -1;
        }
    }
}
