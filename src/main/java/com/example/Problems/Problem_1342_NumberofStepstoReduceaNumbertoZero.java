package com.example.Problems;

public class Problem_1342_NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.numberOfSteps(14));

    }
    static class Solution{
        public int numberOfSteps(int num) {
            int cnt=0;
            for (; num>0; cnt++){
                if (num % 2 == 1) num--;
                else num /= 2;
            }
            return cnt;
        }
    }
}
