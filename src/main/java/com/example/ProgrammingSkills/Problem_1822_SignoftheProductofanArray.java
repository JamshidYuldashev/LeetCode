package com.example.ProgrammingSkills;

public class Problem_1822_SignoftheProductofanArray {
    public static void main(String[] args) {

        System.out.println(new Solution().arraySign(new int[]{-1,-2,-3,-4,3,2,1}));


    }
    static class Solution {
        public int arraySign(int[] nums) {
            int sign = 1;

            for (final int num : nums) {
                if (num == 0)
                    return 0;
                if (num < 0)
                    sign = -sign;
            }

            return sign;
        }
    }
}
