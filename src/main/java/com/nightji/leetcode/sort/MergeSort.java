package com.nightji.leetcode.sort;

import com.nightji.leetcode.basic.ArrayUtil;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[]{9, 38, 65, 97, 76, 13, 27, 49};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array);
        ArrayUtil.printArray(array);
    }

    public void mergeSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        mergeSort(array, 0, array.length - 1, new int[array.length]);
    }

    public void mergeSort(int[] array, int left, int right, int[] temp) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid, temp);
            mergeSort(array, mid + 1, right, temp);
            merge(array, left, mid, right, temp);
        }
    }

    public void merge(int[] array, int left, int mid, int right, int[] temp) {
        int i = left, j = mid + 1;
        int m = mid, n = right;
        int k = 0;
        while (i <= m && j <= n) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= m) {
            temp[k++] = array[i++];
        }
        while (j <= n) {
            temp[k++] = array[j++];
        }
        for (i = 0; i < k; i++) {
            array[left + i] = temp[i];
        }
    }


}
