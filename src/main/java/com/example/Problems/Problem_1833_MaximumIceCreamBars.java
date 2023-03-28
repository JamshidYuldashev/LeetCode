package com.example.Problems;

import java.util.Arrays;

public class Problem_1833_MaximumIceCreamBars {
    public static void main(String[] args) {


    }
    static class Solution {
        public int maxIceCream(int[] costs, int coins) {
            // Store ice cream costs in increasing order.
            Arrays.sort(costs);
            int n = costs.length;
            int answer = 0;
            // Pick ice creams till we can.
            while (answer < n && costs[answer] <= coins) {
                // We can buy this icecream, reduce the cost from the coins.
                coins -= costs[answer];
                answer += 1;
            }
            return answer;
        }
    }
}



