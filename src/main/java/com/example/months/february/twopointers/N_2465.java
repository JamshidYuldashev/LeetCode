package com.example.months.february.twopointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/number-of-distinct-averages/?envType=problem-list-v2&envId=2mvft4gi
public class N_2465 {
  public int distinctAverages(int[] nums) {
    Set<Double> distinctAverages = new HashSet<>();

    Arrays.sort(nums);

    int left = 0, right = nums.length - 1;
    while (left < right) {
      double average = (nums[left] + nums[right]) / 2.0;

      distinctAverages.add(average);

      left++;
      right--;
    }

    return distinctAverages.size();
  }

  public static void main(String[] args) {
    N_2465 solution = new N_2465();
    int[] nums = {4,1,4,0,3,5};
    int result = solution.distinctAverages(nums);
    System.out.println(result);
  }

}
