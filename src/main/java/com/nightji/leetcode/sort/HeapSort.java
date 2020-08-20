package com.nightji.leetcode.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HeapSort {

    public static void main(String[] args) {
        int[] array = new int[]{9, 38, 65, 97, 76, 13, 27, 49};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);
        heapSort.printArray(array);
    }

    public int[] sort(int[] array) {
        buildMaxHeap(array);
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, 0, i);
        }
        return array;
    }

    public void buildMaxHeap(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, i, n);
        }
    }

    public void heapify(int[] array, int i, int len) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;
        if (left < len && array[left] > array[largest]) {
            largest = left;
        }
        if (right < len && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(array, i, largest);
            heapify(array, largest, len);
        }

    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void printArray(int[] array) {
        System.out.println(Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
    }


}
