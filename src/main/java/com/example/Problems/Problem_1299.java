package com.example.Problems;

public class Problem_1299 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int[] replaceElements(int[] arr) {
            int maxRight=0;
            for (int i = arr.length - 1; i >= 0; --i) {
                int a = arr[i];
                arr[i] = maxRight;
                maxRight = Math.max(maxRight, a);
            }
            return arr;
        }
    }
}
