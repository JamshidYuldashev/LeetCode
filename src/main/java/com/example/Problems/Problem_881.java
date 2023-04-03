package com.example.Problems;

import java.util.Arrays;

public class Problem_881 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numRescueBoats(new int[]{1,2},3));
    }

    static class Solution{
        public int numRescueBoats(int[] people, int limit) {
            int ans = 0;

            Arrays.sort(people);

            for (int i = 0, j = people.length - 1; i <= j; ++ans) {
                int remain = limit - people[j--];
                if (people[i] <= remain)
                    ++i;
            }

            return ans;
        }
    }
}
