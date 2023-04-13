package com.example.Problems;

public class Problem_1486_XOROperationinanArray {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.xorOperation(4, 3));
    }

    static class Solution{
        public int xorOperation(int n, int start) {
            int i, xor=0;
            for ( i = 0; i < n ; i++)
                xor=start + 2 * i;

            return xor;
        }
    }
}
