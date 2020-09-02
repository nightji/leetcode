package com.nightji.leetcode.basic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayUtil {

    public static void printArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        System.out.println(Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",")));
    }

    public static void printArray(String[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        System.out.println(String.join(",", array));
    }

    public static void printArray(int[][] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int row = 0; row < array.length; row ++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col]);
                if (col != array[row].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }

}
