package com.example.LeetCode_75;

public class Problem_200_NumberofIslands {
    public static void main(String[] args) {

    }

    static class Solution {

        //function that find the number of islands
        public int numIslands(char[][] grid) {
            int h = grid.length;    //finds and stores the length of the matrix or grid
            if (h == 0) return 0;   //if matrix has no elements, returns 0

            int l = grid[0].length; //variable to store result
            int result = 0;

            for (int i = 0; i < h; i++) {  //loop iterates over rows
                for (int j = 0; j < l; j++) {

                    //if the above condition returns true, calls the dfs() function and increments the result
                    if (grid[i][j]==1){
                        dfs(grid, i, j);
                        result++;
                    }
                }
            }
            return result;
        }

        //function performs the "Depth_First_Search" over the matrix  💡
        public void dfs(char[][] grid, int row, int col){
            int H = grid.length;
            int L = grid[0].length;

            //returns true if any of the condition returns true
            if (row < 0 || col < 0 || row >= H || col >= L || grid[row][col] != 1){
                return;
            }

            grid[row][col]='0';   //marking element as visited

            dfs(grid, row+1, col);  //moves in right
            dfs(grid, row-1, col);  //moves in left
            dfs(grid, row, col+1);  //moves in downward
            dfs(grid, row, col-1);  //moves in upward
        }
    }
}
