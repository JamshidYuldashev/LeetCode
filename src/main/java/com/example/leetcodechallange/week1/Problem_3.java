package com.example.leetcodechallange.week1;

import java.util.HashSet;

public class Problem_3 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
  }

  static class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> numSet = new HashSet<>();
      for (int num : nums) {
        numSet.add(num);
      }

      int longestStreak = 0;

      for (int num : numSet) {
        // Ketma-ketlik boshlanishi tekshiriladi
        if (!numSet.contains(num - 1)) {
          int currentNum = num;
          int currentStreak = 1;

          // Ketma-ketlik uzunligi hisoblanadi
          while (numSet.contains(currentNum + 1)) {
            currentNum++;
            currentStreak++;
          }

          // Eng katta uzunlikni topish
          longestStreak = Math.max(longestStreak, currentStreak);
        }
      }

      return longestStreak;
    }
  }
}
