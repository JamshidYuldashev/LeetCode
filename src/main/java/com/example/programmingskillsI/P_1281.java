package com.example.programmingskillsI;

import java.util.Arrays;

public class P_1281 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subtractProductAndSum(234));
    }

    public static class Solution {
        public int subtractProductAndSum(int n) {
            var product=1;
            var sum=0;
            while (n>0){
                int digit = n%10;
                product *= digit;
                sum += digit;
                n = n/10;
            }
            return product - sum;
        }
    }
}
