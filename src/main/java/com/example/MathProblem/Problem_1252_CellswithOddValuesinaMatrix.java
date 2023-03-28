package com.example.MathProblem;

public class Problem_1252_CellswithOddValuesinaMatrix {
    public static void main(String[] args) {
        System.out.println(new Solution().oddCells(2, 3, new int[][]{{0,1}, {1, 1}}));
    }
    static class Solution {
        public int oddCells(int m, int n, int[][] indices) {
            int ans=0;
            boolean[] rows=new boolean[n];
            boolean[] cols=new boolean[n];

            for (int[] idx:indices){
                rows[idx[0]]= !rows[idx[0]];
                cols[idx[1]]= !cols[idx[1]];
            }

            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (rows[i]^cols[j])
                        ++ans;
                }
            }
            return ans;
        }
    }
}
