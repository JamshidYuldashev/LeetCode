package com.example.months.feb;

import java.util.PriorityQueue;

// https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/
public class Day13 {

  public int minOperations(int[] nums, int k) {
    PriorityQueue<Long> pq = new PriorityQueue<>();
    for (int x : nums) {
      pq.offer((long) x);
    }
    int ans = 0;
//    for (; pq.size() > 1 && pq.peek() < k; ++ans) {
//      long x = pq.poll(), y = pq.poll();
//      pq.offer(x * 2 + y);
//    }

    while (pq.size()>1 && pq.peek() < k) {
      long x = pq.poll(), y = pq.poll();
      pq.offer(x * 2 + y);
      ans++;
    }
    return ans;
  }

  public static void main(String[] args) {
    Day13 solution = new Day13();
    int[] nums = {2,11,10,1,3}; // 2
    int k = 5;
    int result = solution.minOperations(nums, k);
    System.out.println(result);
  }
}
