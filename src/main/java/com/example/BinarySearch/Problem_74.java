package com.example.BinarySearch;

public class Problem_74 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.searchMatrix(
                new int[][]{
                        {1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60}}, 3));
    }

    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int row = searchPotentialRow(matrix, target);
            if (row != -1){
                return binarySearchOverRow(row, matrix, target);
            }
            return false;
        }

        private int searchPotentialRow(int[][] matrix, int target){
            int low = 0;
            int high = matrix.length-1;
            while (low <= high){
                int mid = (low + high) / 2;

                if (matrix[mid][0] <= target && target <= matrix[mid][matrix[0].length-1]){
                    return mid;
                } else if (matrix[mid][0] < target) {
                    low = mid + 1;
                }else if (matrix[mid][0] > target){
                    high = mid - 1;
                }
            }
            return -1;
        }

        private boolean binarySearchOverRow(int row, int[][] matrix, int target){
            int low = 0;
            int high = matrix[row].length-1;

            while(low <= high){
                int mid = (low + high) / 2;
                if (matrix[row][mid] == target){
                    return true;
                } else if (matrix[row][mid] > target) {
                    high = mid - 1;
                }else low = mid + 1;
            }
            return false;
        }
    }
}
