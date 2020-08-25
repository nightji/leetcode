package com.nightji.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LeetCode93 {

    public static void main(String[] args) {
        String s = "25525511135";
        LeetCode93 leetCode93 = new LeetCode93();
        System.out.println(leetCode93.restoreIpAddresses(s));
    }

    public List<String> restoreIpAddresses(String s) {
        int len = s.length();
        List<String> res = new ArrayList<>();
        if (len < 3 || len > 12) {
            return res;
        }
        Deque<String> path = new ArrayDeque<>();
        dfs(s, len, 0, 4, path, res);
        return res;
    }

    public void dfs(String s, int len, int begin, int residue, Deque<String> path, List<String> res) {
        if (begin == len) {
            if (residue == 0) {
                res.add(String.join(".", path));
            }
            return;
        }
        for (int i = begin; i < begin + 3; i++) {
            if (i >= len) {
                break;
            }
            if (residue * 3 < len - i) {
                continue;
            }
            if (judgeIpSegment(s, begin, i)) {
                path.addLast(s.substring(begin, i + 1));
                dfs(s, len, i + 1, residue - 1, path, res);
                path.removeLast();
            }
        }


    }

    public boolean judgeIpSegment(String s, int start, int end) {
        int len = end - start + 1;
        if (len > 1 && s.charAt(start) == '0') {
            return false;
        }
        String currentIpSegment = s.substring(start, end + 1);
        Integer ip = Integer.parseInt(currentIpSegment);
        return ip >=0 && ip <= 255;
    }

}
