package com.example.MathProblem;

public class Problem_1281_SubtracttheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {

    }
    static class Solution {
        public int smallestEvenMultiple(int n) {
            int product = 1;
            int sum = 0;

            for (; n>0; n/=10){
                product *= n % 10;
                sum += n % 10;
            }
            return product - sum;
        }
    }
}
