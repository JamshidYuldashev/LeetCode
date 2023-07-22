package com.example.BinarySearch;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Problem_981 {
    public static void main(String[] args) {

    }

    static class TimeMap {

        private final Map<String, TreeMap<Integer, String>> map;
        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            map.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
        }

        public String get(String key, int timestamp) {
            if (!map.containsKey(key)){
                return "";
            }
            TreeMap<Integer, String> values = map.get(key);
            Integer floorTimestamp = values.floorKey(timestamp);
            if (floorTimestamp == null){
                return "";
            }
            return values.get(floorTimestamp);
        }
    }

}
