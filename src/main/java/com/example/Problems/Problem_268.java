package com.example.Problems;

public class Problem_268 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(new int[]{2,0,3,4}));

    }

    static  class Solution {
        public int missingNumber(int[] nums) {
            int number = nums.length;

            for (int i = 0; i < nums.length; ++i) {
                number ^= i ^ nums[i];
            }
            return number;
        }
    }
}
