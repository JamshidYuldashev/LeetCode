package com.example.Problems;

public class Problem_205 {
    public static void main(String[] args) {
        Solution solution=new Solution();

    }

    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            for(int i = 0; i < s.length(); i++){
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);
                if(s.lastIndexOf(c1) != t.lastIndexOf(c2))
                    return false;
            }
            return true;
        }

    }
}