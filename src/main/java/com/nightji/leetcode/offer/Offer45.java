package com.nightji.leetcode.offer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Offer45 {

    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Offer45 offer45 = new Offer45();
        System.out.println(offer45.minNumber2(nums));

    }

    public String minNumber(int[] nums) {
        List<String> array = Arrays.stream(nums).mapToObj(String::valueOf).sorted((a, b) -> (a + b).compareTo(b + a)).collect(Collectors.toList());
        return String.join("", array);
    }

    public String minNumber2(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        StringBuilder stringBuilder = new StringBuilder();
        for (int num : nums) {
            stringBuilder.append(num);
        }
        return stringBuilder.toString();
    }

    public void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivot = partition(nums, low, high);
            quickSort(nums, low, pivot - 1);
            quickSort(nums, pivot + 1, high);
        }
    }

    public int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low, j = high;
        while (i < j) {
            while (i < j && compare(nums[j], pivot) >= 0) {
                j--;
            }
            while (i < j && compare(nums[i], pivot) <= 0) {
                i++;
            }
            if (i != j) {
                swap(nums, i, j);
            }
        }
        swap(nums, low, i);
        return i;
    }

    public int compare(int x, int y) {
        String s1 = x + "" + y;
        String s2 = y + "" + x;
        return s1.compareTo(s2);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
