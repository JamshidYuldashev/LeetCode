package com.example.Problems;

public class Problem_283_MoveZeroes {
    public static void main(String[] args) {
    }
    static class Solution {
        public void moveZeroes(int[] nums) {
            int i=0;
            for (final int num : nums) {
                if (num != 0)
                    nums[i++]=num;
            while (i<nums.length)
                nums[i++]=0;
            }
        }
    }
}
