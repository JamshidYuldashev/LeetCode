package com.example.Problems;

import java.util.ArrayList;
import java.util.List;

public class Problem_1431 {
    public static void main(String[] args) {
        System.out.println(new Solution().kidsWithCandies(new int[]{1,2,3,4}, 3));
    }
    static class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int maxCandyCount = 0;
            for (int candy : candies) {
                maxCandyCount = Math.max(maxCandyCount, candy);
            }

            List<Boolean> result = new ArrayList<>();
            for (int candy : candies) {
                result.add((candy+extraCandies) >= maxCandyCount);
            }
            return result;
        }
    }
}
