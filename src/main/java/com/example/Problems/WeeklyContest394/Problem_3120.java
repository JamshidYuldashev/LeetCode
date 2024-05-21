package com.example.Problems.WeeklyContest394;


import java.util.HashSet;

public class Problem_3120 {

  public static void main(String[] args) {

    String word = "aaAbcBC";
    System.out.println(Solution.countSpecialCharacters(word));
  }

  static class Solution {
    public static int countSpecialCharacters(String word) {
      var lower = new HashSet<>();
      var upper = new HashSet<>();

      for (char c : word.toCharArray()) {
        if (Character.isLowerCase(c)) {
          lower.add(c);
        } else if (Character.isUpperCase(c)) {
          upper.add(Character.toLowerCase(c));
        }
      }

      lower.retainAll(upper);
      return lower.size();
    }
  }
}
