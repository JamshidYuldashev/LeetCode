package com.example.Problems;

import java.util.Arrays;

public class Problem_561 {
    public static void main(String[] args) {
        Solution solution=new Solution();
//        System.out.println(solution.arrayPairSum(new int[]{1,4,3,2}));
        int[] nums = new int[]{6,2,6,5,1,2};

        int ans = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 2)
            ans += nums[i];

        System.out.println(ans);

    }
    static  class Solution {
        public int arrayPairSum(int[] nums) {
            int ans = 0;

            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i += 2)
                ans += nums[i];

            return ans;
        }
    }
}
