package com.example.BinarySearch;

public class Problem_33 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{4,5,6,7,0,1,2}, 0));
    }
    static class Solution {
        public int search(int[] nums, int target) {
            int mid, left = 0;
            int right = nums.length-1;


            // binary search
            while(left <= right){

                // count mid /2
                mid = (left + right)/2;
                if (nums[mid] == target){
                    return mid;

                } else if (nums[left] <= nums[mid]) {
                    if (nums[left] <= target && target < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    if (nums[mid] < target && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }

            return -1;
        }
    }
}
