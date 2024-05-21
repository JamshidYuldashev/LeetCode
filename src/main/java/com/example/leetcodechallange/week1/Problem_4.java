package com.example.leetcodechallange.week1;

public class Problem_4 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    long[] result = solution.sumOfThree(33);
    for (long l : result) {
      System.out.println(l);
    }
  }

  static class Solution {
    public long[] sumOfThree(long num) {
      if (num % 3 != 0 || num < 3)
        return new long[0];

      long[] result = new long[3];

      long ans = (num - 3) / 3;
      result[0] = ans;
      result[1] = ans + 1;
      result[2] = ans + 2;
      return result;
    }
  }

}
