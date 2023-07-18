package com.example.BinarySearch;

public class Problem_774 {
    // Find Smallest Letter Greater Than Target
    // https://leetcode.com/studyplan/binary-search/#:~:text=Easy-,Find,-Smallest%20Letter%20Greater

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.nextGreatestLetter(new char[]{'c','f','j'},'a'));

    }

    static class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int left = 0;
            int right = letters.length;
             while(left < right){
                 final int middle = (left + right) / 2;
                 if (letters[middle] > target){
                     right = middle;
                 }else {
                     left = middle + 1;
                 }
             }
            return letters[left % letters.length];
        }
    }
}
