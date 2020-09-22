package com.nightji.leetcode.offer;

public class Offer15 {

    public static void main(String[] args) {
        Offer15 offer15 = new Offer15();
        System.out.println(offer15.hammingWeight(9));
    }

    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            n = n & n - 1;
            res++;
        }
        return res;
    }


}
