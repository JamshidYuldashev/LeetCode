package com.example.Problems;

import java.util.Arrays;

    public class Problem_1491_AverageSalaryExcluding {
    public static void main(String[] args) {
        System.out.println(new Solution().average(new int[]{4000,3000,1000,2000}));
    }
    static class Solution {
        public double average(int[] salary) {
            Arrays.sort(salary);
            int ans = 0;
            for (int i = 1; i < salary.length-1; i++) {
                ans+=salary[i];
            }
            int n = salary.length-2;
            return (double) ans/n;
        }
    }
}
