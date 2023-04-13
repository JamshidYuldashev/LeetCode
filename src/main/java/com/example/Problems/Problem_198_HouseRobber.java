package com.example.Problems;

public class Problem_198_HouseRobber {
    public static void main(String[] args) {
        System.out.println(new Solution().rob(new int[]{2,7,9,3,1}));
    }
    static class Solution {
        public int rob(int[] nums) {
           int prev1=0;
           int prev2=0;

            for (int num : nums) {
                final int cnt = Math.max(prev1, prev2+num);
                prev2=prev1;
                prev1=cnt;
            }
            return prev1;
        }
    }
}
