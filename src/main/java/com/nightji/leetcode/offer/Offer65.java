package com.nightji.leetcode.offer;

public class Offer65 {

    public static void main(String[] args) {
        Offer65 offer65 = new Offer65();
        System.out.println(offer65.add(1, 3));
    }

    public int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        return add(a ^ b, (a & b) << 1);
    }

}
