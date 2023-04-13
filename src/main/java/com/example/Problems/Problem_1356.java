package com.example.Problems;

import java.util.Arrays;

public class Problem_1356 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})));
    }

    static class Solution {
        public int[] sortByBits(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++)
                arr[i] += 10001 * Integer.bitCount(arr[i]);
            Arrays.sort(arr);
            for (int i = 0; i < n; i++)
                arr[i]=arr[i] % 10001;
            return arr;
        }
    }
}
