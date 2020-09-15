package com.nightji.leetcode.offer;

public class Offer43 {

    public static void main(String[] args) {
        Offer43 offer43 = new Offer43();
        System.out.println(offer43.countDigitOne(13));
    }

    public int countDigitOne(int n) {
        return f(n);
    }

    public int f(int n) {
        if (n <= 0) {
            return 0;
        }
        String s = String.valueOf(n);
        int high = s.charAt(0) - '0';
        int pow = (int)Math.pow(10, s.length() - 1);
        int last = n - high * pow;
        if (high == 1) {
            return f(pow - 1) + last + 1 + f(last);
        } else {
            return pow + high * f(pow - 1) + f(last);
        }
    }

}
