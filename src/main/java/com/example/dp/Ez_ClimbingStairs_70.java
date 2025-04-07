package com.example.dp;

// https://leetcode.com/problems/climbing-stairs/description/
public class Ez_ClimbingStairs_70 {

  public static class Solution {
    public int climbStairs(int n) {
      if (n<=2) return n;

      var dp = new int[n + 1];
      dp[1] = 1;
      dp[2] = 2;

      for (int i = 3; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
      }

      return dp[n];
    }
  }

  public static void main(String[] args) {

    Solution solution = new Solution();
    System.out.println(solution.climbStairs(5)); // Output: 8
    System.out.println(solution.climbStairs(10)); // Output: 89
    System.out.println(solution.climbStairs(20)); // Output: 10946
  }
}
