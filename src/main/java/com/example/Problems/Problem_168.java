package com.example.Problems;

public class Problem_168 {
    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(1));
    }
    static class Solution {
        public String convertToTitle(int columnNumber) {
            StringBuilder sb = new StringBuilder();
            while(columnNumber > 0){
                columnNumber--;
                char ch = (char) (columnNumber % 26 + 'A');
                columnNumber /= 26;
                sb.append(ch);
            }

            sb.reverse();
            return sb.toString();
        }
    }
}
