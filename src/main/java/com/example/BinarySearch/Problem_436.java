package com.example.BinarySearch;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Problem_436 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(Arrays.toString(solution.findRightInterval(new int[][]{{3, 4}, {2, 3}, {1, 2}})));
    }

    static class Solution {
        public int[] findRightInterval(int[][] intervals) {
            if (intervals == null || intervals.length == 0){
                return new int[0];
            }

            TreeMap<Integer, Integer> tm = new TreeMap<>();
            int n = intervals.length;

            // intervals=[[3,4],[2,3],[1,2]]

            for (int i = 0; i < n; i++) {
                //             key: 3 = value: 0
                //             key: 2 = value: 1
                //             key: 1 = value: 2
                tm.put(intervals[i][0], i);
            }

            int[] result = new int[n];

            for (int i = 0; i < n; i++) {
                Map.Entry<Integer, Integer> entry = tm.ceilingEntry(intervals[i][1]);
                result[i] = entry == null? -1 : entry.getValue();
                //  4 == -1
                //  3 == 0
                //  2 == 1
            }
            //    result = [-1, 0, 1]
            return result;
        }
    }
}
