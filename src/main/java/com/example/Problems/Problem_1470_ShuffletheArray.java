package com.example.Problems;

import java.util.Arrays;

public class Problem_1470_ShuffletheArray {
    public static void main(String[] args) {
        Solution solution=new Solution();

        int []nums={2,5,1,3,4,7};
        int n = 3;
        int[] result = new int[2*n];

        for (int i = 0; i < n; i++) {

            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }
        System.out.println(Arrays.toString(result));


    }


    static class Solution {
        public int[] shuffle(int[] nums, int n) {

            return nums;
        }
    }
}



