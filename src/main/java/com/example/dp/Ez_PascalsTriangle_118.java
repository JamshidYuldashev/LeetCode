package com.example.dp;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/description/
public class Ez_PascalsTriangle_118 {
  public static class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> result = new ArrayList<>();

      for (int row = 0; row < numRows; row++) {
        List<Integer> currentRow = new ArrayList<>();
        for (int column = 0; column <= row; column++) {
          if (column==0 || column==row) {
            currentRow.add(1);
          } else {
            var aboveLeft = result.get(row - 1).get(column - 1);
            var aboveRight = result.get(row - 1).get(column);
            currentRow.add(aboveLeft + aboveRight);
          }
        }
        result.add(currentRow);
      }
      return result;
    }
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.generate(5));
  }

}
