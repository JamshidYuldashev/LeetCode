package com.example.daily;

public class day_14 {

  public static void main(String[] args) {
    day_14Solution solution = new day_14Solution();
    int[] nums = {1,2,3,4};
    int result = solution.longestSubarray(nums);
    System.out.println(result);
  }
}

class day_14Solution {
  public int longestSubarray(int[] nums) {
    int maxAnd = 0;

    for (int num : nums) {
      maxAnd = Math.max(maxAnd, num);
    }

    int maxLength = 0;
    int currentLength = 0;

    for (int num : nums) {
      if (num == maxAnd) {
        currentLength++;
      } else {
        maxLength = Math.max(maxLength, currentLength);
        currentLength = 0;
      }
    }

    maxLength = Math.max(maxLength, currentLength);

    return maxLength;
}
}
