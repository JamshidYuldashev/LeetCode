package com.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_66 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{1,2,3})));
    }

    static class Solution {
        public int[] plusOne(int[] digits) {
            int sum = 0;
            for (int digit : digits) {
                sum = sum * 10 + digit;
            }
            sum+=1;
            return convert(sum);
        }

        private int[] convert(int sum) {
            ArrayList<Integer> array = new ArrayList<>();
            do{
                array.add(sum % 10);
                sum /= 10;
            } while  (sum > 0);
            return array.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
