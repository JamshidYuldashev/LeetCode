package com.example.Problems;

public class Probem_70_ClimbingStairs {
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
