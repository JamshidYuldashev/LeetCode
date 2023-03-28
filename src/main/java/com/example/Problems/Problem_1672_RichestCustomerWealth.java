package com.example.Problems;

public class Problem_1672_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        Solution solution=new Solution();
        System.out.println(solution.maximumWealth(accounts));
    }

    static class Solution {
        public int maximumWealth(int[][] accounts) {
            int maxx=Integer.MIN_VALUE;
            for (int[] account : accounts) {
                int sum = 0;
                for (int i : account) {
                    sum += i;
                }
                maxx = Math.max(maxx, sum);
            }
            return maxx;
        }
    }
}



