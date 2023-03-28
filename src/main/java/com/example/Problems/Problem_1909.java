package com.example.Problems;

public class Problem_1909 {
    public static boolean main(String[] args) {
        int[] nums=new int[]{1,2,10,5,7};
        boolean ans=false;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i-1]>= nums[i]) {
                if (ans)
                    return false;
                ans = true;
                if (i > 1 && nums[i - 2] >= nums[i]) {
                    nums[i] = nums[i - 1];
                }
            }
            return true;
        }
        return ans;
    }
}
