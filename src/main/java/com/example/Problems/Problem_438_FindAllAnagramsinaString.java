package com.example.Problems;

import java.util.ArrayList;
import java.util.List;

public class Problem_438_FindAllAnagramsinaString {
    public static void main(String[] args) {

    }

    static class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> ans=new ArrayList<>();
            int[] cnt = new int[128];
            int required = p.length();

            for (final char c : p.toCharArray()) {
                ++cnt[c];
            }

            for (int l = 0, r = 0; r < s.length(); ++r) {
                if (--cnt[s.charAt(r)] >= 0 ){
                    --required;
                }
                while (required == 0){
                    if (r-l+1 == p.length()){
                        ans.add(l);
                    }
                    if (++cnt[s.charAt(l++)] > 0){
                        ++required;
                    }
                }
            }
            return ans;
        }
    }
}
