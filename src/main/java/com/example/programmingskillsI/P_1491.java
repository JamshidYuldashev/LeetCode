package com.example.programmingskillsI;

import java.util.Arrays;

public class P_1491 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.average(new int[]{4000,3000,1000,2000}));
    }

    public static class Solution {
        public double average(int[] salary) {

           Arrays.sort(salary);

           double n = salary.length-2;
           int cnt = 0;
            for (int i = 1; i<=n; i++) {
                cnt += salary[i];
            }
            return cnt/n;
        }
    }
}
