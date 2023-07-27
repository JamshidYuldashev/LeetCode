package com.example.BinarySearch;

public class Problem_69 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.mySqrt(8));
    }

    static class Solution {
        public int mySqrt(int x) {
            if (x == 0){
                return 0;
            }

            int left = 1;
            int right = x;

            while(left <= right){
                int mid = (left + right) / 2;
                if (mid <= (x/mid) && (mid + 1) > x / (mid + 1)){
                    return mid;
                } else if (mid >  x / mid) {
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
            return -1;
        }
    }
}
