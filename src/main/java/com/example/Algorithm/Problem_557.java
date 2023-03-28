package com.example.Algorithm;

public class Problem_557{
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(new Solution().reverseWords(s));
    }

    static class Solution {
        public String reverseWords(String s) {
            String[] words =s.split("\\s");
            StringBuilder reverseWords=new StringBuilder();
            for(String w:words){
                StringBuilder sb=new StringBuilder(w);
                sb.reverse();
                reverseWords.append(sb.toString()).append(" ");
            }
            return reverseWords.toString().trim();
        }
    }
}
