package com.example.Problems;

import java.util.Stack;

public class Problem_844_BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(new Solution().backspaceCompare("ab#c", "ad#c"));
    }

    static class Solution {
        public boolean backspaceCompare(String s, String t) {
            return build(s).equals(build(t));
        }
        public String build(String S) {
            Stack<Character> ans = new Stack();
            for (char c: S.toCharArray()) {
                if (c != '#')
                    ans.push(c);
                else if (!ans.empty())
                    ans.pop();
            }
            return String.valueOf(ans);
        }
    }
}
