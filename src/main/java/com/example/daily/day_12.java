package com.example.daily;

public class day_12 {

  public static void main(String[] args) {
    day_12Solution solution = new day_12Solution();
    String allowed = "abc";
    String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};
    int result = solution.countConsistentStrings(allowed, words);
    System.out.println(result);
  }
}

class day_12Solution {
  public int countConsistentStrings(String allowed, String[] words) {
    int count = 0;
    for (String word : words) {
      boolean isConsistent = true;
      for (char c : word.toCharArray()) {
        if (!allowed.contains(String.valueOf(c))) {
          isConsistent = false;
          break;
        }
      }
      if (isConsistent) {
        count++;
      }
    }
    return count;
  }
}