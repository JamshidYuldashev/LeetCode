package com.example.MathProblem;

public class Problem_1323_Maximum69Number {
    public static void main(String[] args) {
        System.out.println(new Solution().maximum69Number(6696));
    }

    static class Solution {
        public int maximum69Number (int num) {
            char[] ans = String.valueOf(num).toCharArray();
            for (int i = 0; i < ans.length; ++i) {
                if (ans[i] == '6'){
                    ans[i] = '9';
                    break;
                }
            }
            return Integer.parseInt(String.valueOf(ans));
        }
    }
}
