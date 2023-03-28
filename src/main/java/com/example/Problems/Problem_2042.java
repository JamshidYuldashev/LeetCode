package com.example.Problems;

public class Problem_2042 {
    public static void main(String[] args) {
        String s="1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        int cnt=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==48){
                System.out.println(s.charAt(i));
            }
        }
    }
}
