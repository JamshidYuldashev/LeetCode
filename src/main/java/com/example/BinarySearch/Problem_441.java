package com.example.BinarySearch;

public class Problem_441 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.arrangeCoins(5));
    }

    static class Solution {
        public int arrangeCoins(int n) {
            var k = Math.sqrt(2 *  n);
            var totalCoins = (k * (k + 1)) / 2;

            if (totalCoins > n) {
                return (int) (k - 1);
            } else {
                return (int) k;
            }
        }
    }
}
