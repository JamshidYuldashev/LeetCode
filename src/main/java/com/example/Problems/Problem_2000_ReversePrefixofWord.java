package com.example.Problems;

public class Problem_2000_ReversePrefixofWord {
    public static void main(String[] args) {
        String s = "xyxzxe";
        char ch = 'z';
        System.out.println(new Solution().reversePrefix(s, ch));
    }
    static class Solution {
        public String reversePrefix(String word, char ch) {
            boolean b=false;
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i)!=ch){
                    builder.append(word.charAt(i));
                }else {
                    b=true;
                    builder.append(word.charAt(i));
                    break;
                }
            }
            builder.reverse();
            for (int i = builder.length(); i < word.length(); i++) {
                builder.append(word.charAt(i));
            }

            return b?builder.toString():word;



            /*
            final int i = word.indexOf(ch) + 1;
            return new StringBuilder(word.substring(0, i))
            .reverse()
            .append(word.substring(i))
            .toString();

             */
        }
    }
}
