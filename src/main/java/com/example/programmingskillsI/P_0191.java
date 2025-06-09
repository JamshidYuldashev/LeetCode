package com.example.programmingskillsI;

public class P_0191 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(11));
    }

    public static class Solution {
        public int hammingWeight(int n) {

            var binary = Integer.toBinaryString(n);
            int count = 0;
            for (char c : binary.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }

            return count;
        }
    }
}
