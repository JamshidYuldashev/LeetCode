package com.example.Problems;

public class Problem_2469_ConverttheTemperature {
    public static void main(String[] args) {
        Solution solution=new Solution();
        for (double v : solution.convertTemperature( 122.11)) {
            System.out.print(v);
        }
    }
    static class Solution {
        public double[] convertTemperature(double celsius) {
            double[] ans=new double[2];
            ans[0]=celsius + 273.15;
            ans[1]=celsius * 1.80 + 32.00;
            return ans;
        }
    }
}
