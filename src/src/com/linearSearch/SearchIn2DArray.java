package com.linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    static void main() {
        int[][] array2D = {
                {1,2,3},
                {4,5,6,7},
                {8,9,10,11,12,13,14},
                {16,17}
        };

        int target = 13;
        int[] index = searchElement(array2D,target);
        System.out.println(Arrays.toString(index));
    }

    // will return the index (i,j) of the target element:
    // if no element found then return(-1,-1)
    static int[] searchElement(int[][] array2D, int target) {
        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[row].length; col++) {
                if(array2D[row][col] == target) {
                    //new int[]{} is used aas this array was never initialized ;
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
