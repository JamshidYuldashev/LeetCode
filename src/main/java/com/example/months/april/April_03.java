package com.example.months.april;

//https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/description/?envType=daily-question&envId=2025-04-03
public class April_03 {
  public static class Solution {
    public long maximumTripletValue(int[] nums) {
      int n = nums.length;
      if (n < 3) return 0;

      // Step 1: Prefix max
      int[] prefix_max = new int[n];
      prefix_max[0] = nums[0];
      for (int i = 1; i < n; i++) {
        prefix_max[i] = Math.max(prefix_max[i - 1], nums[i]);
      }

      // Step 2: Suffix max
      int[] suffix_max = new int[n];
      suffix_max[n - 1] = nums[n - 1];
      for (int k = n - 2; k >= 0; k--) {
        suffix_max[k] = Math.max(suffix_max[k + 1], nums[k]);
      }

      // Step 3: Find max triplet value
      long maxResult = 0;
      for (int j = 1; j < n - 1; j++) {
        long value = (long) (prefix_max[j - 1] - nums[j]) * suffix_max[j + 1];
        maxResult = Math.max(maxResult, value);
      }

      return maxResult;
    }
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {12,6,1,2,7};
    long result = solution.maximumTripletValue(nums);
    System.out.println(result);
  }
}
