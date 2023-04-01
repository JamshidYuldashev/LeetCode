package com.example.Problems;

import java.util.HashSet;
import java.util.Set;

public class Problem_1832_SentenceIsPangram {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

   static class Solution {
        public boolean checkIfPangram(String sentence) {
            Set<Character> set = new HashSet<>();
            for (final char c : sentence.toCharArray()) {
                set.add(c);
            }
            return set.size() == 26;
        }
    }
}
