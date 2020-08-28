package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.ArrayUtil;

import java.util.*;

public class Offer38 {

    public static void main(String[] args) {
        String s = "abc";
        Offer38 offer38 = new Offer38();
        ArrayUtil.printArray(offer38.permutation(s));
    }

    public String[] permutation(String s) {
        int len = s.length();
        boolean[] used = new boolean[len];
        Deque<Character> path = new ArrayDeque<>();
        List<String> res = new ArrayList<>();
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        dfs(charArray, len, 0, used, path, res);
        return res.toArray(new String[0]);
    }

    public void dfs(char[] charArray, int len, int depth, boolean[] used, Deque<Character> path, List<String> res) {
        if (len == depth) {
            StringBuilder stringBuilder  = new StringBuilder();
            path.forEach(stringBuilder::append);
            res.add(stringBuilder.toString());
            return;
        }

        for (int i = 0; i < len; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && charArray[i] == charArray[i - 1] && !used[i-1]) {
                continue;
            }
            path.addLast(charArray[i]);
            used[i] = true;
            dfs(charArray, len, depth + 1, used, path, res);
            used[i] =false;
            path.removeLast();
        }
    }


}
