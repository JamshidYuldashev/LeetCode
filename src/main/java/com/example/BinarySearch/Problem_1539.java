package com.example.BinarySearch;

public class Problem_1539 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.findKthPositive(new int[]{2,3,4,7,11}, 5));
    }

    static class Solution {
        public int findKthPositive(int[] arr, int k) {
            int left = 0;
            int right = arr.length;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] - mid - 1 < k) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            return left + k;

        }
    }
}
