package com.example.Problems;

import java.util.Arrays;

public class Problem_1748 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sumOfUnique(new int[]{1,1,1,1,1}));
    }

    static class Solution {
        public int sumOfUnique(int[] nums) {
            int ans = Arrays.stream(nums)
                    .distinct()
                    .sum();
            return ans;
        }
    }
}
