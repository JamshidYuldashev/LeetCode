package com.example.Problems;

public class Problem_169 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{3,2,3}));
    }
    static class Solution {
        public int majorityElement(int[] nums) {
            Integer ans = null;
            int count = 0;

            for (final int num : nums) {
                if (count == 0)
                    ans = num;
                count += num == ans ? 1 : -1;
            }

            return ans;
        }
    }
}
