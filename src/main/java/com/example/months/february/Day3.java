package com.example.months.february;

public class Day3 {
  public int longestMonotonicSubarray(int[] nums) {

    if (nums == null || nums.length == 0) {
      return 0;
    }

    int max_length = 1;
    int increasing_length = 1;
    int decreasing_length = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > nums[i - 1]) {
        increasing_length++;
        decreasing_length = 1;
      } else if (nums[i] < nums[i - 1]) {
        decreasing_length++;
        increasing_length = 1;
      } else {
        increasing_length = 1;
        decreasing_length = 1;
      }

      max_length = Math.max(max_length, increasing_length);
      max_length = Math.max(max_length, decreasing_length);
    }

    return max_length;
  }

  public static void main(String[] args) {
    Day3 solution = new Day3();
    int[] nums = {1, 4, 3, 3, 2};
    int result = solution.longestMonotonicSubarray(nums);
    System.out.println(result);
  }
}
