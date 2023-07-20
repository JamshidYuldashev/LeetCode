package com.example.BinarySearch;

import java.util.Arrays;

public class Problem_704 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{-1,0,3,5,9,12}, 9));

    }

    static class  Solution {
        public int search(int[] nums, int target) {
            int low = 0;
            int high = nums.length-1;

            while (low <= high){
                int middle = (low + high) /2;
                if (nums[middle] == target) return middle;
                else if (target > nums[middle]) low = middle + 1;
                else high = middle - 1;
            }
            return -1;
        }
    }
}
