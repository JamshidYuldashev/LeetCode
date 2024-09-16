package com.example.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class day_16 {
  public static void main(String[] args) {
    day_16Solution solution = new day_16Solution();
    List<String> timePoints = Arrays.asList("00:00","23:59","00:00");
    int result = solution.findMinDifference(timePoints);
    System.out.println("Eng kichik vaqt farqi: " + result + " daqiqa");
  }
}

class day_16Solution {
  public int findMinDifference(List<String> timePoints) {
    // Vaqtlar soni 1440 (24 soat) dan ko'p bo'lsa, dublikatlar bor va minimal farq 0 bo'ladi
    if (timePoints.size() > 1440) {
      return 0;
    }

    // Barcha vaqtlarni daqiqaga aylantiramiz
    List<Integer> minutes = new ArrayList<>();
    for (String time : timePoints) {
      minutes.add(convertToMinutes(time));
    }

    // Daqiqalarni tartiblaymiz
    Collections.sort(minutes);

    // Minimal farqni topish uchun katta qiymat boshlang'ich qiymat qilib olinadi
    int minDiff = Integer.MAX_VALUE;

    // Ketma-ket vaqtlar orasidagi farqni topamiz
    for (int i = 1; i < minutes.size(); i++) {
      int diff = minutes.get(i) - minutes.get(i - 1);
      minDiff = Math.min(minDiff, diff);
    }

    // Eng oxirgi va birinchi vaqt orasidagi tsiklik farqni hisoblaymiz
    int circularDiff = 1440 + minutes.get(0) - minutes.get(minutes.size() - 1);
    minDiff = Math.min(minDiff, circularDiff);

    return minDiff;
  }

  private Integer convertToMinutes(String time) {
    String[] parts = time.split(":");
    int hours = Integer.parseInt(parts[0]);
    int minutes = Integer.parseInt(parts[1]);
    return hours * 60 + minutes;
  }

}