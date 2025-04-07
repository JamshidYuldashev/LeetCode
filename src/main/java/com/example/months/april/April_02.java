package com.example.months.april;

// https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/description/?envType=daily-question&envId=2025-04-02
public class April_02 {

  public static class Solution {
    public long maximumTripletValue(int[] nums) {
      var n = nums.length;
      if (n<3) return 0;

      var maxPrefix = new int[n];
      maxPrefix[0] = nums[0];

      for (int i = 1; i < n; i++) {
        maxPrefix[i] = Math.max(maxPrefix[i-1], nums[i]);
      }

      var maxSuffix = new int[n];
      maxSuffix[n-1] = nums[n-1];

      for (int k = n - 2; k >= 0; k--) {
        maxSuffix[k] = Math.max(maxSuffix[k + 1], nums[k]);
      }

      var maxValue = 0L;

      for (int j = 1; j < n - 1; j++) {
        long leftMax = maxPrefix[j - 1];
        long rightMax = maxSuffix[j + 1];

        if (leftMax > nums[j]) {
          long value = (leftMax - nums[j]) * rightMax;
          maxValue = Math.max(maxValue, value);
        }
      }

      return maxValue;
    }
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {12,6,1,2,7};
    long result = solution.maximumTripletValue(nums);
    System.out.println(result);
  }
}
