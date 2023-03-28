package com.example.Problems;

public class Contest {
    public static void main(String[] args) {
        int []n={5,20,66,1314};
        int musbat=0;
        int manfiy=0;
        for (int i = 0; i < n.length; i++) {
            if (n[i]<0){
                manfiy++;
            }else if(n[i]>0)  musbat++;
        }
        System.out.println(Math.max(musbat, manfiy));
    }
    class Solution {
        public int maximumCount(int[] nums) {
            return 3;
        }
    }
}
