package com.example.BinarySearch;

public class Problem_35 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(new int[]{1,3,5,6}, 5));
    }

   static class Solution {
        public int searchInsert(int[] nums, int target) {
            int low=0;
            int high=nums.length-1;

            while (low<=high){
                int mid = (low+high)/2;
                if (nums[mid] == target)
                    return mid;
                else if (nums[mid] < target)
                    low = mid + 1;
                else high = mid - 1;
            }

            return low;
        }
    }
}
