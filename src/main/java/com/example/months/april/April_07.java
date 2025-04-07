package com.example.months.april;

//https://leetcode.com/problems/partition-equal-subset-sum/?envType=daily-question&envId=2025-04-07

import java.util.Arrays;

public class April_07 {

  public static class Solution {
    public boolean canPartition(int[] nums) {
      int totalSum = 0;
      for (int num : nums) {
        totalSum += num;
      }

      if (totalSum % 2 != 0) {
        return false;
      }

      int target = totalSum / 2;

      boolean[] dp = new boolean[target + 1];
      dp[0] = true;

      for (int num : nums) {
        for (int i = target; i >= num; i--) {
          if (dp[i - num]) {
            dp[i] = true;
          }
        }
      }

      return dp[target];
    }
  }


  public static void main(String[] args) {
    Solution solution = new Solution();

    int[] nums1 = {1, 5, 11, 5};
    System.out.println("Natija: " + solution.canPartition(nums1)); // true

    System.out.println("------");

    int[] nums2 = {1, 2, 3, 5};
    System.out.println("Natija: " + solution.canPartition(nums2)); // false
  }
}
