package com.example.Problems;

import java.util.Arrays;

public class Problem_1046_LastStoneWeight {
    public static void main(String[] args) {
        System.out.println(new Solution().lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
    static class Solution {
        public int lastStoneWeight(int[] stones) {
            if (stones.length == 1) return stones[0];
            Arrays.sort(stones);
            int last = stones.length - 1;
            int prev = stones.length - 2;

            while (stones[last] != 0) {
                if (stones[prev] == 0) return stones[last];
                stones[last] = stones[last] - stones[prev];
                stones[prev] = 0;
                Arrays.sort(stones);
            }
            return 0;
        }
    }
}
