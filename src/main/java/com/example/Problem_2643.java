package com.example;

import java.util.Arrays;

public class Problem_2643 {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {1, 0, 0},
                {3, 3, 3},
                {4, 4, 4}
        };
        System.out.println(Arrays.toString(Solution.rowAndMaximumOnes(arr)));
    }

    static class Solution {
        public static int[] rowAndMaximumOnes(int[][] arr) {
            // {index, maxCount}
            int ans[]=new int[2];

            for(int i=0;i<arr.length;i++){
                // number of 1 in ith row
                int count=0;

                // getting count of 1s
                for(int j=0;j<arr[i].length;j++){
                    if(arr[i][j]==1)
                        count++;
                }

                // checking for maximum count
                if(count>ans[1]){
                    ans[1]=count;
                    ans[0]=i;
                }
            }
            return ans;
        }
    }
}
