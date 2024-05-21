package com.example.leetcodechallange.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem_2 {
  public static void main(String[] args) {
    System.out.println(Solution.isValid("()"));
  }

  //20. Valid Parentheses
  static class Solution {
    public  static boolean isValid(String s) {
      // Qavslarning mosligini tekshirish uchun xarita yaratamiz
      Map<Character, Character> matchingBrackets = new HashMap<>();
      matchingBrackets.put(')', '(');
      matchingBrackets.put('}', '{');
      matchingBrackets.put(']', '[');

      // Ochuvchi qavslarni saqlash uchun stek yaratamiz
      Stack<Character> stack = new Stack<>();

      // Har bir belgini ko'rib chiqamiz
      for (char c : s.toCharArray()) {
        // Agar yopuvchi qavs bo'lsa, mos keluvchi ochuvchi qavsni tekshiramiz
        if (matchingBrackets.containsKey(c)) {
          // Stekning eng yuqori qismi mos keladimi yoki stek bo'shmi?
          char topElement = stack.empty() ? '#' : stack.pop();
          if (topElement != matchingBrackets.get(c)) {
            return false;
          }
        } else {
          // Agar ochuvchi qavs bo'lsa, stekga qo'shamiz
          stack.push(c);
        }
      }

      // Stek bo'sh bo'lsa, barcha ochilgan qavslar mos ravishda yopilgan
      return stack.isEmpty();
    }
  }
}
