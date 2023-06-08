package com.example.maang;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MAANG_FindAllNumbersDisappearedInAnArray_01 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    public static class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int i = 1; i <=nums.length; ++i) {
                set.add(i);
            }
            for (int x:nums){
                set.remove(x);
            }
            return new LinkedList<>(set);
        }
    }
}
