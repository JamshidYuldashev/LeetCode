package com.example.BinarySearch;

public class Problem_367 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPerfectSquare(16));
    }

    static class Solution {
        public boolean isPerfectSquare(int num) {
            if (num < 0) {
                return false;
            }
            int left = 0;
            int right = num;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long square = (long) mid * mid;
                if (square == num) {
                    return true;
                } else if (square < num) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return false;
        }
    }
}
