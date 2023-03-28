package com.example.ProgrammingSkills;

public class Problem_896 {
    public static void main(String[] args) {
        System.out.println(new Solution().isMonotonic(new int[]{4, 3, 2, 1}));
    }
    static class Solution {
        public boolean isMonotonic(int[] nums) {
            int n = nums.length;
            boolean up=true, down=true;

            for (int i = 0; i < n-1; i++) {
                if (nums[i] > nums[i + 1]) {
                    up = false;
                    break;
                }
            }

            for (int i = 0; i < n-1; i++) {
                if (nums[i] < nums[i + 1]) {
                    down = false;
                    break;
                }
            }
            return up || down;
        }
    }
}
