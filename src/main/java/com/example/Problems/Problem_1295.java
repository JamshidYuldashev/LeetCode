package com.example.Problems;

public class Problem_1295 {
    public static void main(String[] args) {
        int[] nums = new int[]{555,901,482,1771};
        int cnt=0;

        String s;
        for (int num : nums) {
            s = Integer.toString(num);
            if (s.length() % 2 == 0)
                cnt++;
        }

        System.out.println(cnt);
    }
}
