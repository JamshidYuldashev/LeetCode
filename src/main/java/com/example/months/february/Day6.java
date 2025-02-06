package com.example.months.february;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/tuple-with-same-product/
public class Day6 {
  public int tupleSameProduct(int[] nums) {
    Map<Integer, Integer> productCount = new HashMap<>();
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int product = nums[i] * nums[j];
        productCount.put(product, productCount.getOrDefault(product, 0) + 1);
      }
    }

    int result = 0;
    for (Integer value : productCount.values()) {
      if (value >= 2) {
        result += (value * (value - 1)) / 2 * 8;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Day6 obj = new Day6();
    int[] nums = {2, 3, 4, 6};
    System.out.println(obj.tupleSameProduct(nums)); // 8
  }
}
