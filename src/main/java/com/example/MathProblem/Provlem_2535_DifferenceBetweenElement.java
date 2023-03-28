package com.example.MathProblem;

public class Provlem_2535_DifferenceBetweenElement {
    public static void main(String[] args) {
        System.out.println(new Solution().differenceOfSum(new int[]{1,2,3,4}));
    }
    static class Solution {
        public int differenceOfSum(int[] nums) {
            int n1=0, n2=0, digit;

            for (int num : nums) {
                if (num > 9) {
                    int number = num;
                    while (number > 0) {
                        digit = number % 10;
                        n2 = n2 + digit;
                        number = number / 10;
                    }
                }else
                    n2+=num;
                n1 += num;
            }
            return n1-n2;
        }
    }
}
