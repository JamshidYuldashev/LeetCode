package com.example.ProgrammingSkills;

public class Problem_1523_CountOddNumbersinanIntervalRange {
    public static void main(String[] args) {
        System.out.print(new Solution().countOdds(3, 7));

    }
    static class Solution {
        public int countOdds(int low, int high) {
            if(low%2==0){
                low=low+1;
            } if(high%2==0){
                high=high-1;
            }
            return (high-low)/2+1;
        }
    }
}
