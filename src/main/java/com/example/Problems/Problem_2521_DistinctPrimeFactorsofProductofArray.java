package com.example.Problems;

public class Problem_2521_DistinctPrimeFactorsofProductofArray {
    public static void main(String[] args) {

        Solution solution=new Solution();
        System.out.println(solution.distinctPrimeFactors(new int[]{2}));
    }


    static class Solution {
        public int distinctPrimeFactors(int[] nums) {
            int number=nums[0];
            for (int i = 1; i < nums.length; ++i) {
                number=number*nums[i];
            }

            int sum=0,cnt=0;
            for(int i = 2; i < number; i++) {
                while(number%i == 0) {
                    if (cnt!=i){
                        cnt=i;
                        sum++;
                    }
                    number = number/i;
                }
            }

            if(number >=2) {
                return sum+1;
            }else {
                return sum;
            }
        }
    }
}



