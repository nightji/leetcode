package com.nightji.leetcode.sort;

import com.nightji.leetcode.basic.ArrayUtil;

public class QuickSort {

    public static void main(String[] args) {
        int a[] = { 5,7,1,6,4,8,3,2 };
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(a, 0, a.length - 1);
        ArrayUtil.printArray(a);
    }

    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int i = partition(array, low, high);
            quickSort(array, 0, i - 1);
            quickSort(array, i + 1, high);
        }
    }

    public int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low, j = high;
        while (i < j) {
            while (i < j && array[j] >= pivot) {
                j--;
            }
            while (i < j && array[i] <= pivot) {
                i++;
            }
            if (i != j) {
                swap(array, i, j);
            }
        }
        swap(array, i, low);
        return i;
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
