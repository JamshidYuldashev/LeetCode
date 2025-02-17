package com.example.months.february;

// https://leetcode.com/problems/letter-tile-possibilities/

import java.util.HashSet;
import java.util.Set;

public class Day17 {

    public int numTilePossibilities(String tiles) {
      // Set yordamida unikal ketma-ketliklarni saqlaymiz
      Set<String> result = new HashSet<>();

      // Harflarning ishlatilganligini kuzatib borish uchun boolean array
      boolean[] used = new boolean[tiles.length()];

      // Backtrackingni boshlash uchun rekursiv funksiyani chaqiramiz
      backtrack(tiles, new StringBuilder(), used, result);

      // Bo'sh ketma-ketlikni hisoblamaslik uchun natijadan 1 ni ayiramiz
      return result.size();
    }

    private void backtrack(String tiles, StringBuilder current, boolean[] used, Set<String> result) {
      // Agar joriy ketma-ketlik bo'sh bo'lmasa, uni natijaga qo'shamiz
      if (current.length() > 0) {
        result.add(current.toString());
      }

      // Har bir harfni tanlash uchun loop
      for (int i = 0; i < tiles.length(); i++) {
        // Agar harf allaqachon ishlatilgan bo'lsa, o'tkazib yuboramiz
        if (used[i]) continue;

        // Takrorlanadigan harflardan qochish uchun:
        // Agar oldingi harf bilan bir xil bo'lsa va oldingi harf ishlatilgan bo'lmasa, o'tkazib yuboramiz
        if (i > 0 && tiles.charAt(i) == tiles.charAt(i - 1) && !used[i - 1]) continue;

        // Harfni ishlatilgan deb belgilaymiz
        used[i] = true;

        // Joriy harfni ketma-ketlikka qo'shamiz
        current.append(tiles.charAt(i));

        // Keyingi pozitsiya uchun rekursiv chaqiruv
        backtrack(tiles, current, used, result);

        // Backtrack: Harfni olib tashlaymiz va ishlatilganligini bekor qilamiz
        current.deleteCharAt(current.length() - 1);
        used[i] = false;
      }
    }

    public static void main(String[] args) {
      Day17 solution = new Day17();

      // Test case 1
      System.out.println(solution.numTilePossibilities("AAB")); // Output: 8

      // Test case 2
      System.out.println(solution.numTilePossibilities("AAABBC")); // Output: 188

      // Test case 3
      System.out.println(solution.numTilePossibilities("V")); // Output: 1
    }

  }
