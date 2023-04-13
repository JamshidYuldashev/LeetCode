package com.example.Problems;

import java.util.Stack;

public class Problem_71 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.simplifyPath("/home/"));
    }

    static class Solution {
        public String simplifyPath(String path){
            final String[] directory = path.split("/");
            Stack<String> stack = new Stack<>();

            for (final String s : directory) {
                if (s.isEmpty() || s.equals("."))
                    continue;

                if (s.equals("..")){
                    if (!s.isEmpty())
                        stack.pop();
                }else
                    stack.push(s);

            }
            return "/" + String.join("/", stack);
        }
    }
}
