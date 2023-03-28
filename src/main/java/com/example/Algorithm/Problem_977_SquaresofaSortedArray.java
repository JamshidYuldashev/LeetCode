package com.example.Algorithm;

import java.util.Arrays;

public class Problem_977_SquaresofaSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().sortedSquares(new int[]{-7, -3, 2, 3, 11})));

    }
    static class Solution {
        public int[] sortedSquares(int[] nums) {
            for (int i = 0; i < nums.length; ++i) {
                nums[i]= (int) Math.pow(nums[i], 2);
            }
            Arrays.sort(nums);
            return nums;
        }
    }
}
