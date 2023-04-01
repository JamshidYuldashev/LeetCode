package com.example.Problems;

public class Problem_1221 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.balancedStringSplit("RLRRRLLRLL"));
    }

    static class Solution {
        public int balancedStringSplit(String s) {
            int ans = 0;
            int cnt = 0;

            for (final char c : s.toCharArray()){
                cnt += c == 'L' ? 1: -1;
                if (cnt == 0)
                    ++ans;
            }
            return ans;
        }
    }
}
