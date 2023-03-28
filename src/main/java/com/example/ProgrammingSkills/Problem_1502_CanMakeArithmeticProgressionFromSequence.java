package com.example.ProgrammingSkills;

import java.util.Arrays;

public class Problem_1502_CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        System.out.println(new Solution().canMakeArithmeticProgression(new int[]{3, 5, 1}));
    }
    static class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            return checkIsAP(arr, arr.length);
        }
        static boolean checkIsAP(int[] arr, int n){
            if (n == 1)
                return true;
            Arrays.sort(arr);
            int cnt=arr[1]-arr[0];
            for (int i = 2; i < n; i++) {
                if (arr[i]-arr[i-1] != cnt)
                    return false;
            }
            return true;
        }
    }
}
