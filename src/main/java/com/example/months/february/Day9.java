package com.example.months.february;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/count-number-of-bad-pairs/description/?envType=daily-question&envId=2025-02-09
public class Day9 {
  public long countBadPairs(int[] nums) {
    int n = nums.length;
    long totalPairs = (long) n * (n - 1) / 2;

    // Hash map yaratish va yaxshi juftliklar sonini hisoblash
    Map<Integer, Integer> freqMap = new HashMap<>();
    long goodPairs = 0;

    for (int i = 0; i < n; i++) {
      int diff = nums[i] - i; // nums[i] - i ni hisoblash
      // Agar hash mapda bu diff oldin ham bor bo'lsa, undan oldingi bor yo'qligini hisoblash
      if (freqMap.containsKey(diff)) {
        goodPairs += freqMap.get(diff);
      }
      // Hash mapga diff ni yangi sanovini saqlash
      freqMap.put(diff, freqMap.getOrDefault(diff, 0) + 1);
    }

    // Bad juftliklar sonini hisoblash
    long badPairs = totalPairs - goodPairs;

    return badPairs;

  }

  public static void main(String[] args) {
    Day9 solution = new Day9();
    int[] nums = {4, 1, 3, 3};
    long result = solution.countBadPairs(nums);
    System.out.println(result);
  }
}
