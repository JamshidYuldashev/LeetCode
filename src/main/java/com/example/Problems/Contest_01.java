package com.example.Problems;

import java.util.PriorityQueue;

public class Contest_01 {
    public static void main(String[] args) {


    }
    class Solution {
        public long maxKelements(int[] nums, int k) {
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
                    (a,b) -> Integer.compare(b, a)
            );
            for (int n : nums){
                priorityQueue.add(n);
            }
            long sum = 0;
            while (k-- >0){
                int n = priorityQueue.poll();
                sum +=n;
                priorityQueue.add((int) Math.ceil((double)n/3));
            }
            return sum;
        }
    }

}
