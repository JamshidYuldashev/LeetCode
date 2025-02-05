package com.example.months.february;

// https://leetcode.com/problems/maximum-ascending-subarray-sum/description/?envType=daily-question&envId=2025-02-04
public class Day4 {
  public int maxAscendingSum(int[] nums) {
    if (nums == null || nums.length == 0)
      return 0;

    int currentSum = nums[0];
    int maxSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if(nums[i] > nums[i - 1]) {
        currentSum += nums[i];
      }else {
        currentSum = nums[i];
      }
      maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    Day4 solution = new Day4();
    int[] nums = {10, 20, 30, 5, 10, 50};
    int result = solution.maxAscendingSum(nums);
    System.out.println(result);
  }
}
