package com.example.Problems;

import java.util.*;

public class Problem_88_MergeSortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        solution.merge(nums1, m,nums2, n);



    }

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int j=0;
            ArrayList<Integer> arr_new = new ArrayList<>();
            for(int i=0;i<nums1.length;  i++){
                if(nums1[i]!=j){
                    arr_new.add(nums1[i]);
                }
            }
            for (int i = 0; i < nums2.length; i++) {
                arr_new.add(nums2[i]);
            }
            Collections.sort(arr_new);
        }
        }
    }



