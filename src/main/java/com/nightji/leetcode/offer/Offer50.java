package com.nightji.leetcode.offer;

public class Offer50 {

    public static void main(String[] args) {
        Offer50 offer50 = new Offer50();
        String s = "abaccdeff";
        System.out.println(offer50.firstUniqChar(s));
    }

    public char firstUniqChar(String s) {
        char[] cs = s.toCharArray();
        int[] count = new int[256];
        for (char c : cs) {
            count[c]++;
        }
        for (char c : cs) {
            if (count[c] == 1) {
                return c;
            }
        }
        return ' ';
    }

}
