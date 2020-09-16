package com.nightji.leetcode.offer;

public class Offer58_II {

    public static void main(String[] args) {
        Offer58_II offer58_ii = new Offer58_II();
        System.out.println(offer58_ii.reverseLeftWords2("lrloseumgh", 6));
    }

    public String reverseLeftWords(String s, int n) {
        char[] cs = s.toCharArray();
        int length = cs.length;
        if (length == 0 || n == 0) {
            return s;
        }
        char[] res = new char[length];
        for (int i = n; i < length; i++) {
            res[i - n] = cs[i];
        }
        for (int i = 0; i < n; i++) {
            res[length - n + i] = cs[i];
        }
        return String.valueOf(res);
    }

    public String reverseLeftWords2(String s, int n) {
        int size = s.length();
        if (size <= 1 || n == 0) {
            return s;
        }
        char[] cs = s.toCharArray();
        reverse(cs, 0, n - 1);
        reverse(cs, n, size - 1);
        reverse(cs, 0, size - 1);
        return String.valueOf(cs);
    }

    public void reverse(char[] cs, int left, int right) {
        while (left < right) {
            swap(cs, left, right);
            left++;
            right--;
        }
    }

    public void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }

}
