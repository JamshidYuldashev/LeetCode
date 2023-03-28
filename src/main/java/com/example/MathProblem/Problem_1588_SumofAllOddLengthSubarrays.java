package com.example.MathProblem;

public class Problem_1588_SumofAllOddLengthSubarrays {
    public static void main(String[] args) {
        Solution solution=new Solution();

    }

    static class Solution{
        public int sumOddLengthSubarrays(int[] arr) {
            int result=0;
            int l=arr.length;

            for (int i = 0; i < l; i++) {
                for (int j = i; j < l; j+=2) {
                    for (int k = i; k <= j; k++) {
                        result+=arr[k];
                    }
                }
            }

            return result;
        }
    }
}
