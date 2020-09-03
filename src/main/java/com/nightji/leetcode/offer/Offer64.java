package com.nightji.leetcode.offer;

public class Offer64 {

    public static void main(String[] args) {
        Offer64 offer64 = new Offer64();
        System.out.println(offer64.sumNums2(10));
    }

    public int sumNums(int n) {
        return n == 0 ? 0 : n + sumNums(n - 1);
    }

    public int sumNums2(int n) {
        boolean flag = n > 0 && (n += sumNums2(n - 1)) > 0;
        return n;
    }

}
