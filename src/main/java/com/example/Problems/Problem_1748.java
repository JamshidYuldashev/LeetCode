package com.example.Problems;

import java.util.HashMap;

public class Problem_1748 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sumOfUnique(new int[]{1,1,1,1,1}));
    }

    static class Solution {
        public int sumOfUnique(int[] nums) {
            HashMap<Integer,Integer> ms = new HashMap<>();
            for(int i =0;i<nums.length;i++){
                if(ms.containsKey(nums[i])){
                    ms.put(nums[i],ms.get(nums[i])+1);
                }
                else{
                    ms.put(nums[i],1);
                }
            }
            int ans=0;
            for(int i:ms.keySet()){
                if(ms.get(i)==1){
                    ans+=i;
                }
            }
            return ans;
        }
    }
}