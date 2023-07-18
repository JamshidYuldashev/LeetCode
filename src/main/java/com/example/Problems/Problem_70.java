package com.example.Problems;

public class Problem_70 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.climbStairs(3));

    }

    static class Solution {
        public int climbStairs(int n) {
            if (n < 2) return 1;
            return climbStairs(n-1)+climbStairs(n-2);
        }
    }
}
