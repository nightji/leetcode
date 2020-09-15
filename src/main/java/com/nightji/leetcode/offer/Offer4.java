package com.nightji.leetcode.offer;

public class Offer4 {

    public static void main(String[] args) {
        Offer4 offer4 = new Offer4();
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}};
        System.out.println(offer4.findNumberIn2DArray(matrix, 3));
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            int num = matrix[row][col];
            if (num == target) {
                return true;
            } else if (num > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

}
