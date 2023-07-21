package com.example.Problems;

public class Problem_415 {
    public static void main(String[] args) {
        System.out.println(new Solution().addStrings("11", "123"));
    }
    static class Solution {
        public String addStrings(String num1, String num2) {
            int result=0;
            result += convert(num1);
            result += convert(num2);
            return String.valueOf(result);
        }

        static int convert(String s){
            int num = 0;
            int n = s.length();

            for(int i = 0; i < n; i++)
                num = num * 10 + ((int)s.charAt(i) - 48);

            return num;
        }
    }
}
