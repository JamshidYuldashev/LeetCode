package com.example.maang;

public class MAANG_Missing_Number_01 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(new int[]{3,0,1}));

    }

    static class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int sum = (1 + n) * n / 2;
            for (int x : nums) {
                sum -= x;
            }
            return sum;
        }
    }
}
