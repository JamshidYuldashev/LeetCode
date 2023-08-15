package com.example.InterviewBit;

import java.util.HashMap;
import java.util.Map;

public class Problem_01 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.minDistance("Anshuman", "Antihuman"));

    }

    public static class Solution {
        public int minDistance(String A, String B) {
            int m = A.length();
            int n = B.length();

            Map<String, Integer> map = new HashMap<>();
            return helper(A, B, m, n, map);
        }

        private static int helper(String A, String B, int i, int j, Map<String, Integer> map){
            String key = i + "-" + j;
            if (map.containsKey(key)){
                return map.get(key);
            }

            if (i == 0) {
                map.put(key, j);
                return j;
            }
            if (j == 0) {
                map.put(key, i);
                return i;
            }

            if (A.charAt(i - 1) == B.charAt(j - 1)) {
                // Characters are the same, no operation needed
                int result = helper(A, B, i - 1, j - 1, map);
                map.put(key, result);
                return result;
            } else {
                // Characters are different, choose the minimum of the three operations
                int insert = helper(A, B, i, j - 1, map) + 1;
                int delete = helper(A, B, i - 1, j, map) + 1;
                int replace = helper(A, B, i - 1, j - 1, map) + 1;
                int result = Math.min(insert, Math.min(delete, replace));
                map.put(key, result);

                return result;
            }
        }
    }
}
