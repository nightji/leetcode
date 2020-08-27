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
                .collect(Collectors.joining(", ")));
    }

}
