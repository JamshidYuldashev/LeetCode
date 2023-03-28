package com.example.MathProblem;

public class Problem_1688_CountofMatchesinTournament {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.numberOfMatches(14));
    }

    static class Solution{
        public int numberOfMatches(int n) {
            int result=0;
            while (n!=1){
                if (n%2==1){
                    result+=(n-1)/2;
                    n=(n-1)/2+1;
                }else {
                    result+=n/2;
                    n=n/2;
                }
            }
            return result;
        }
    }
}
