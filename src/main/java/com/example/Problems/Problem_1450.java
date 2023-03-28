package com.example.Problems;

public class Problem_1450{
    public static void main(String[] args) {
        int[] startTime=new int[]{1,2,3};
        int[] endTime=new int[]{3,2,7};
        int queryTime=5;

        final int n = startTime.length;
        int cnt=0;
        for (int i = 0; i < n; i++) {
            if (startTime[i]<=queryTime && queryTime <= endTime[i])
                cnt++;
        }

    }
}
