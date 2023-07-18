package com.example.Problems;

public class Problem_747 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.dominantIndex(new int[]{1,2,3,6}));
    }

    static class Solution {
        public int dominantIndex(int[] nums) {
            int maxIndex = -1, maxValue = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]>maxValue){
                    maxIndex = i;
                    maxValue = nums[i];
                }
            }

            for (int i = 0; i < nums.length; i++) {
                if (i != maxIndex && maxValue < 2 * nums[i])
                    return -1;
            }

            return maxIndex;
        }
    }
}
