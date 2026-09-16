package com.Binar_Search_Matrix;

import java.util.Arrays;

public class SearchInSortedMatrix {
    static void main() {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 49;

        int[] idx = searchInMatrix(matrix,target);
        System.out.println(Arrays.toString(idx));
        System.out.println(matrix.length);
    }

    static  int[] searchInMatrix(int[][] matrix, int target){
        int minRow = 0;
        int maxCol = matrix.length -1; // for  n x m matrix , maxCol = m-1

        while(minRow < matrix.length && maxCol >= 0){
            if(matrix[minRow][maxCol] == target) return new int[] {minRow,maxCol};
            else if(target < matrix[minRow][maxCol]) maxCol--;
            else if (target > matrix[minRow][maxCol]) minRow++;
        }
        return new int[] {-1,-1};
    }
}
