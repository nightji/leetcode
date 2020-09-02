package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.ArrayUtil;

public class Offer40 {

    public static void main(String[] args) {
        Offer40 offer40 = new Offer40();
        int[] array = {0,1,1,1,4,5,3,7,7,8,10,2,7,8,0,5,2,16,12,1,19,15,5,18,2,2,22,15,8,22,17,6,22,6,22,26,32,8,10,11,2,26,9,12,9,7,28,33,20,7,2,17,44,3,52,27,2,23,19,56,56,58,36,31,1,19,19,6,65,49,27,63,29,1,69,47,56,61,40,43,10,71,60,66,42,44,10,12,83,69,73,2,65,93,92,47,35,39,13,75};
        ArrayUtil.printArray(offer40.getLeastNumbers(array, 75));
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0)
            return new int[0];
        int len = arr.length;
        if (k == len)
            return arr;
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        buildMaxHeap(res, k);
        for (int i = k; i < arr.length; i++) {
            if (arr[i] > res[0]) {
                continue;
            }
            res[0] = arr[i];
            shiftDown(res, 0, k);
        }
        return res;
    }

    public void buildMaxHeap(int[] array, int k) {
        for (int i = k / 2 - 1; i >= 0; i--) {
            shiftDown(array, i, k);
        }
    }

    public void shiftDown(int[] array, int i, int len) {
        while (true) {
            int max = i;
            int left = i * 2 + 1;
            int right = i * 2 + 2;
            if (left < len && array[left] > array[max]) {
                max = left;
            }
            if (right < len && array[right] > array[max]) {
                max = right;
            }
            if (max == i) {
                break;
            }
            swap(array, max, i);
            i = max;
        }
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
