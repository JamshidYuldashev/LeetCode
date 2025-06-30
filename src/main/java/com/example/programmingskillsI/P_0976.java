package com.example.programmingskillsI;

import java.util.Arrays;

public class P_0976 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestPerimeter(new int[]{1,2,1,10}));
    }

    public static class Solution {
        public int largestPerimeter(int[] nums) {
            Arrays.sort(nums);  // O(n log n)

            for (int i = nums.length -1 ; i >= 2; i--) {
                if (nums[i-1] + nums[i-2] > nums[i]) {
                    return nums[i] + nums[i-1] + nums[i-2];
                }
            }
            return 0;
        }
    }
}
