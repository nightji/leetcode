package com.nightji.leetcode.offer;

public class Offer67 {

    public static void main(String[] args) {
        Offer67 offer67 = new Offer67();
        String str = "   -42";
        System.out.println(offer67.strToInt(str));
    }


    public int strToInt(String str) {
        int sign = 1, res = 0;
        int length = str.length();
        int i = 0;
        char[] chars = str.toCharArray();
        while (i < length && chars[i] == ' ') {
            i++;
        }
        if (i == length) {
            return 0;
        }
        if (chars[i] == '-') {
            sign = - 1;
            i++;
        } else if (chars[i] == '+') {
            i++;
        }
        for (; i < length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                break;
            }
            if (res > Integer.MAX_VALUE / 10
                    || (res == Integer.MAX_VALUE / 10 && chars[i] > '7')) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + (chars[i] - '0');
        }

        return res * sign;
    }

}
