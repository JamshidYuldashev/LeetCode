package com.example.months.february;

public class Day11 {
  public String removeOccurrences(String s, String part) {

    while (s.contains(part)) {
      s = s.replaceFirst(part, "");
    }

    return s;
  }

  public static void main(String[] args) {
    Day11 solution = new Day11();
    String s = "daabcbaabcbc";
    String part = "abc";
    String result = solution.removeOccurrences(s, part);
    System.out.println(result);
  }

}
