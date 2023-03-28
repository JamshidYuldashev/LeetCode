package com.example.Problems;

public class Problem_1512_NumberofGoodPairs {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int []n = {1,2,3,1,1,3};
    }
    static class Solution {
        public int numIdenticalPairs(int[] nums) {
            int count=0;
            int j=nums.length-1;
            for(int i=0;i<nums.length;i++){
                if(j<i){
                    j=nums.length-1;
                }
                while(i<j){
                    if(nums[i]==nums[j]){
                        count+=1;
                    }
                    j--;
                }
            }
            return count;
        }
    }
}



