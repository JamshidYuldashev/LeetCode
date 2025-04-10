package com.example.months.feb;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Day8 {

  private Map<Integer, Integer> indexToNumber;
  private Map<Integer, TreeSet<Integer>> numberToIndices;

  public Day8() {
    indexToNumber = new HashMap<>();
    numberToIndices = new HashMap<>();
  }

  public void change(int index, int number) {
    if (indexToNumber.containsKey(index)){
      int oldNumber = indexToNumber.get(index);
      if (numberToIndices.containsKey(oldNumber)) {
        numberToIndices.get(oldNumber).remove(index);
        if (numberToIndices.get(oldNumber).isEmpty()) {
          numberToIndices.remove(oldNumber);
        }
      }
    }

    indexToNumber.put(index, number);
    numberToIndices.putIfAbsent(number, new TreeSet<>());
    numberToIndices.get(number).add(index);
  }

  public int find(int number){
    if (numberToIndices.containsKey(number) && !numberToIndices.get(number).isEmpty()) {
      return numberToIndices.get(number).first();
    }
    return -1;
  }

  public static void main(String[] args) {

  }

}
