package com.nightji.leetcode.offer;

public class Offer62 {

    public static void main(String[] args) {
        Offer62 offer62 = new Offer62();
        System.out.println(offer62.lastRemaining(5, 3));
    }

    public int lastRemaining(int n, int m) {
        int pos = 0;
        for (int i = 2; i <= n; i++) {
            pos = (pos + m) % i;
        }
        return pos;
    }

}
