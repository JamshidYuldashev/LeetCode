package com.example.Problems;

import java.util.Arrays;

public class Problem_2037 {
    public static void main(String[] args) {
        int[] seats=new int[]{3,1,5};
        int[] students=new int[]{2,7,4};
        Solution solution = new Solution();
        System.out.println(solution.minMovesToSeat(seats, students));
    }
    static class Solution {
        public int minMovesToSeat(int[] seats, int[] students) {
            Arrays.sort(seats);
            Arrays.sort(students);

            int cnt=0;
            for (int i = 0; i < seats.length; i++)
               if (seats[i]>students[i]){
                   cnt+=seats[i]-students[i];
               }else
                   cnt+=students[i]-seats[i];

            return cnt;
        }
    }
}
