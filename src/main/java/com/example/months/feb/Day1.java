package com.example.months.feb;

public class Day1 {
  public boolean isArraySpecial(int[] nums) {
    if (nums.length == 1)
      return false;

    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i] % 2 == nums[i + 1] % 2){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Day1 solution = new Day1();
    int[] nums = {1, 2, 3, 4};
    boolean result = solution.isArraySpecial(nums);
    System.out.println(result);
  }
}
