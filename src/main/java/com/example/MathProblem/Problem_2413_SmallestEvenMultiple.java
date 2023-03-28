package com.example.MathProblem;

public class Problem_2413_SmallestEvenMultiple {
    public static void main(String[] args) {

    }
    static class Solution {
        public int smallestEvenMultiple(int n) {
            return n * (n % 2 + 1);
        }
    }
}
