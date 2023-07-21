package com.example.BinarySearch;

import java.util.Arrays;

public class Problem_34 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            int n = nums.length;
            int first = findFirstPosition(nums, target, 0, n - 1);
            int last = findLastPosition(nums, target, 0, n - 1);
            return new int[]{first, last};
        }

        private int findFirstPosition(int[] nums, int target, int left, int right) {
            while (left<=right){
                int mid = (right+left)/2;
                if (nums[mid] == target){
                    if (mid == left || nums[mid - 1] < target){
                        return mid;
                    }
                    right = mid - 1;
                }else if (nums[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            return -1;
        }

        private int findLastPosition(int[] nums, int target, int left, int right) {
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    if (mid == right || nums[mid + 1] > target) {
                        return mid;
                    }
                    left = mid + 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
    }

}
