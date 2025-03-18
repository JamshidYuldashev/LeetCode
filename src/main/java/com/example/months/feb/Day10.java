package com.example.months.feb;

import java.util.Stack;

public class Day10 {
  public String clearDigits(String s) {

    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        if (!stack.isEmpty()){
          stack.pop();
        }
      }else {
        stack.push(c);
      }
    }

    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }

    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    Day10 solution = new Day10();
    String s = "abss123";
    String result = solution.clearDigits(s);
    System.out.println(result);
  }
}
