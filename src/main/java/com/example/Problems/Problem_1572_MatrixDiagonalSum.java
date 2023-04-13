package com.example.Problems;

public class Problem_1572_MatrixDiagonalSum {
    public static void main(String[] args) {
        System.out.println(new Solution().diagonalSum(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));
    }
    static class Solution {
        public int diagonalSum(int[][] mat) {
            int n = mat.length;
            int pd=0, sd=0;
            for (int i = 0; i < n; i++) {
                pd+=mat[i][i];
                sd+=mat[i][n-i-1];
            }
            return n%2==0 ? (pd+sd) : (pd+sd-mat[n/2][n/2]);
        }
    }
}
