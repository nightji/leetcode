package com.nightji.leetcode.offer;

import java.math.BigDecimal;
import java.util.Arrays;

public class Offer14_II {

    public static void main(String[] args) {
        Offer14_II o = new Offer14_II();
        System.out.println(o.cuttingRope(1000));
    }

    public int cuttingRope(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        BigDecimal[] dp = new BigDecimal[n + 1];
        Arrays.fill(dp, new BigDecimal(0));
        dp[0] = new BigDecimal(0);
        dp[1] = new BigDecimal(1);
        dp[2] = new BigDecimal(2);
        dp[3] = new BigDecimal(3);
        for (int i = 4; i <= n; i++) {
            for (int j = 2; j <= i / 2; j++) {
                dp[i] = dp[i].max(dp[j].multiply(dp[i - j]));
            }
        }
        return dp[n].divideAndRemainder(new BigDecimal("1000000007"))[1].intValue();
    }

}
