package com.example.maang;

public class MAANG_BestTimeToBuyAndSellStock_01 {
    public static void main(String[] args) {

    }

    public static class Solution {
        // https://t.me/JamshidYuldashev
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int[] suffixMax = new int[n];
            suffixMax[n-1] = prices[n-1];
            for (int i = n-2; i>=0; --i){
                suffixMax[i] = Math.max(suffixMax[i+1], prices[i]);
            }
            int ans=0;
            for (int i =0; i<n-1;i++){
                ans = Math.max(ans, suffixMax[i+1]-prices[i]);
            }

            return ans;
        }
    }
}
