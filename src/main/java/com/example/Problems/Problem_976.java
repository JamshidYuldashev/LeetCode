package com.example.Problems;

import java.util.Arrays;

public class Problem_976 {
    public static void main(String[] args) {
        System.out.println(new Solution().largestPerimeter(new int[]{2,1,2}));
    }
    static class Solution {
        public int largestPerimeter(int[] nums) {
            Arrays.sort(nums);

            for (int i = nums.length - 1; i > 1; --i) {
                if (nums[-2] + nums[i - 1] > nums[i])
                    return nums[i - 2] + nums[i - 1] + nums[i];
            }
            return 0;
        }
    }
}
