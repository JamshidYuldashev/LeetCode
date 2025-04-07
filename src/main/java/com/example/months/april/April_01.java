package com.example.months.april;

// https://leetcode.com/problems/solving-questions-with-brainpower/?envType=daily-question&envId=2025-04-01
public class April_01 {

    public static long mostPoints(int[][] questions) {
      int n = questions.length;
      long[] dp = new long[n + 1];

      for (int i = n-1; i >= 0; i--) {
       int points = questions[i][0];
       int brainpower = questions[i][1];
       int nextIndex = i + brainpower + 1;

        long take = points + (nextIndex<n ? dp[nextIndex] : 0);
        long skip = dp[i + 1];

        dp[i] = Math.max(take, skip);
      }
      return dp[0];
    }

  public static void main(String[] args) {
    int[][] questions1 = {{3, 2}, {4, 3}, {4, 4}, {2, 5}};
    System.out.println(mostPoints(questions1));
  }
}
