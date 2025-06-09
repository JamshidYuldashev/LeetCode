package com.example.programmingskillsI;

public class P_1523 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.print(solution.countOdds(3, 7));
    }

    public static class Solution {
        public int countOdds(int low, int high) {
            return (high + 1) / 2 - low / 2;
        }
    }
}
