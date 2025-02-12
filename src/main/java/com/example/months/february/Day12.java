package com.example.months.february;

import java.util.HashMap;

// https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/
public class Day12 {

  public int maximumSum(int[] nums) {
    HashMap<Integer, int[]> map = new HashMap<>();
    int maxSum = -1; // Maksimal yig'indi boshlang'ich qiymati

    for (int num : nums) {
      int digitSum = sumOfDigits(num); // Raqamlar yig'indisini hisoblash

      // Agar raqamlar yig'indisi avvaldan mavjud bo'lsa
      if (map.containsKey(digitSum)) {
        int[] pair = map.get(digitSum);
        if (num > pair[0]) {
          // Yangi son birinchi eng katta bo'lsa
          pair[1] = pair[0]; // Avvalgi eng kattani ikkinchi o'rimga o'tkazish
          pair[0] = num;    // Yangi eng kattani birinchi o'rimga qo'yish
        } else if (num > pair[1]) {
          // Yangi son ikkinchi eng katta bo'lsa
          pair[1] = num;
        }
        // Juftlik mavjud bo'lsa, yig'indini hisoblash
        if (pair[1] != -1) {
          maxSum = Math.max(maxSum, pair[0] + pair[1]);
        }
      } else {
        // Birinchi marta raqamlar yig'indisi uchun yangi juftlik qo'shish
        map.put(digitSum, new int[]{num, -1});
      }
    }

    return maxSum;
  }

  // Raqamlar yig'indisini hisoblash funksiyasi
  private int sumOfDigits(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10; // Raqamni qo'shish
      num /= 10;       // Keyingi raqamga o'tish
    }
    return sum;
  }

  public static void main(String[] args) {
    Day12 obj = new Day12();
    System.out.println(obj.maximumSum(new int[]{18, 43, 36, 13, 7})); // Output: 54
    System.out.println(obj.maximumSum(new int[]{10, 12, 19, 14}));    // Output: -1
  }
}
