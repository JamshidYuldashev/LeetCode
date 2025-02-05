package com.example.months.february;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
public class Day5 {
  public boolean areAlmostEqual(String s1, String s2) {
    if (s1.equals(s2)) {
      return true;
    }

    List<Integer> diff = new ArrayList<>();

    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)){
        diff.add(i);
      }
    }

    if (diff.size() != 2) {
      return false;
    }

    int i = diff.get(0);
    int j = diff.get(1);

    return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
  }

}
