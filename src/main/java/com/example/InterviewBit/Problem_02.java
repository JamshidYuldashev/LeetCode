package com.example.InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class Problem_02 {
    public static void main(String[] args) {

        List<Integer> integers=new ArrayList<>();
        integers.add(5);
        integers.add(2);
        integers.add(10);

        Solution solution=new Solution();
        System.out.println(solution.maxProfit(integers));
    }

    public static class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public int maxProfit(List<Integer> A) {
            int cnt = 0;
            for (int i = 1; i < A.size(); i++) {
                if (A.get(i) > A.get(i - 1)) {
                    cnt += A.get(i) - A.get(i - 1);
                }
            }
            return cnt;
        }
    }

}
