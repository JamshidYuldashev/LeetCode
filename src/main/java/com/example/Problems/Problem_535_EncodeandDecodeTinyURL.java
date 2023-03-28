package com.example.Problems;

import java.util.HashMap;
import java.util.Map;

public class Problem_535_EncodeandDecodeTinyURL {
    public static void main(String[] args) {

   }
    public static class Codec {
        static Map<String, String> cache;
        static int count;
        public Codec() {
            cache = new HashMap<>();
            count = 0;
        }
        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String encoded = count + "";
            cache.put(encoded, longUrl);
            count++;
            return encoded;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return cache.get(shortUrl);
        }
    }

}
