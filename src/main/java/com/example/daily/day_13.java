package com.example.daily;

public class day_13 {

  public static void main(String[] args) {
    day_13Solution solution = new day_13Solution();
    int[] arr = {1, 3, 4, 8};
    int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
    int[] result = solution.xorQueries(arr, queries);
    for (int i : result) {
      System.out.println(i);
    }
  }
}


class day_13Solution {
  public int[] xorQueries(int[] arr, int[][] queries) {
    int n = arr.length;
    int[] prefixXOR = new int[n];
    int[] result = new int[queries.length];

    // 1. PrefixXor massivini to'ldirish
    prefixXOR[0] = arr[0];
    for (int i = 1; i < n; i++) {
      prefixXOR[i] = prefixXOR[i - 1] ^ arr[i];
    }

    // 2. Har bir so'rov uchun kerakli XOR ni topish
    for (int i = 0; i < queries.length; i++) {
      int left = queries[i][0];
      int right = queries[i][1];

      // Agar left == 0 bo'lsa, natijani prefixXOR[right] dan olamiz
      if (left == 0) {
        result[i] = prefixXOR[right];
      }else {
        // Aks holda prefixXOR[right] xor prefixXOR[left-1] bo'ladi
        result[i] = prefixXOR[right] ^ prefixXOR[left - 1];
      }
    }

    return result;
  }
}