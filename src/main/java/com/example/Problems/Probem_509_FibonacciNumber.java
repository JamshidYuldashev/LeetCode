package com.example.Problems;

public class Probem_509_FibonacciNumber {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.fib(4));

    }

    static class Solution {
        public int fib(int n) {
            if (n == 0 || n == 1)
                return n;
            return fib(n-1)+fib(n-2);
        }
    }
}
