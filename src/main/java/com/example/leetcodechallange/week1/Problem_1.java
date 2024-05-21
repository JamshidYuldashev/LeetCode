package com.example.leetcodechallange.week1;

public class Problem_1 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
  }

  // 704. Binary Search
  static class Solution {
    public int search(int[] nums, int target) {
      int left = 0;
      int right = nums.length - 1;

      while (left <= right) {
        int middle = left + (right - left) / 2;

        if (nums[middle] == target) {
          return middle;
        } else if (nums[middle] < target) {
          left = middle + 1;
        } else {
          right = middle - 1;
        }
      }
      return -1;
    }
  }
}
