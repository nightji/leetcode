package com.nightji.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

public class Offer48 {

    public static void main(String[] args) {
        Offer48 offer48 = new Offer48();
        String s = "abcabcbb";
        System.out.println(offer48.lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, ans = 0;
        for (int end = 0; end < s.length(); end++) {
            Character c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }
            map.put(c, end);
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }

}
