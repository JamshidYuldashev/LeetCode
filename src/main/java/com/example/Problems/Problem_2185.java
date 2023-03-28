package com.example.Problems;

import java.util.Arrays;

public class Problem_2185 {
    public static void main(String[] args) {
        String[] words=new String[]{"pay","attention","practice","attend"};
        String pref = "at";
        int cnt=0;

        for (String word : words) {
            if (word.startsWith(pref)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
