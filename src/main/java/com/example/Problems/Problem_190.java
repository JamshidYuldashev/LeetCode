package com.example.Problems;

public class Problem_190 {
    public static void main(String[] args) {

    }
    static class Solution {
        // You need treat n as an unsigned value
        public int reverseBits(int n) {
            int ans = 0;

            for (int i = 0; i < 32; ++i)
                if ((n >> i & 1) == 1)
                    ans |= 1 << 31 - i;
 
            return ans;
        }
    }
}
