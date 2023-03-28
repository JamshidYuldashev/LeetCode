package com.example.Problems;

public class Problem_1365 {
    public static void main(String[] args) {
        int[] n = new int[]{7,7,7,7};
        int[] ans = new int[n.length];
        int cnt = 0;

        for (int i = 0; i < n.length; i++) {
            for (int k : n)
                if (n[i] != k && k < n[i])
                    cnt++;

            ans[i]=cnt;
            cnt=0;
        }


        for (int an : ans)
            System.out.println(an);

    }

    static class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] ans = new int[nums.length];
            int cnt = 0;

            for (int i = 0; i < nums.length; i++) {
                for (int k : nums)
                    if (nums[i] != k && k < nums[i])
                        cnt++;

                ans[i]=cnt;
                cnt=0;
            }

           return ans;
        }
    }
}
