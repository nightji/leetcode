package com.nightji.leetcode.offer;

public class Offer58_I {

    public static void main(String[] args) {
        String s = "a good   example";
        Offer58_I offer58_i = new Offer58_I();
        System.out.println(offer58_i.reverseWords(s));
    }

    public String reverseWords(String s) {
        if ("".equals(s)) {
            return s;
        }
        String str = s.trim();
        if (str.length()==0) {
            return "";
        }
        String[] strArray = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strArray.length - 1; i >= 0; i--) {
            if (!strArray[i].equals("")) {
                stringBuilder.append(strArray[i]).append(" ");
            }
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }

}
