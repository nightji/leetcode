package com.nightji.leetcode.offer;

public class Offer16 {

    public static void main(String[] args) {
        Offer16 offer16 = new Offer16();
        System.out.println(offer16.myPow(2, Integer.MIN_VALUE));
    }

    public double myPow(double x, int n) {
        long N = n;
        return n > 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public double quickMul(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double res = 1.0;
        while (n != 0) {
            if (n % 2 == 1) {
                res *= x;
            }
            x *= x;
            n = n / 2;
        }
        return res;
    }

}
