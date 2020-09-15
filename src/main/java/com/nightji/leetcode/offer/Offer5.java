package com.nightji.leetcode.offer;

public class Offer5 {

    public static void main(String[] args) {
        Offer5 offer5 = new Offer5();
        String s = "We are happy.";
        System.out.println(offer5.replaceSpace(s));
    }

    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

}
