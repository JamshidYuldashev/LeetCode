package com.example.BinarySearch;

public class Problem_153 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMin(new int[]{3,4,5,1,2}));
    }

    static class Solution {
        public int findMin(int[] nums) {
            int l = 0;
            int r = nums.length - 1;

            while (l < r) {
                final int m = (l + r) / 2;
                if (nums[m] < nums[r])
                    r = m;
                else
                    l = m + 1;
            }

            return nums[l];
        }
    }
}
