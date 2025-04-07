package com.example.dp;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle-ii/description/
public class Ez_PascalsTriangle_119 {
  public static class Solution {
    public List<Integer> getRow(int rowIndex) {
      List<Integer> row = new ArrayList<>();

      long current = 1;
      row.add((int) current);

      for (int k = 1; k <= rowIndex; k++) {
        current = current * (rowIndex - (k - 1)) / k; //
        row.add((int) current);
      }
      return row;
    }
    /*
    rowIndex = 3:
    C(3, 0) = 1

    C(3, 1) = 3

    C(3, 2) = 3

    C(3, 3) = 1
    */
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.getRow(3));
  }

}
