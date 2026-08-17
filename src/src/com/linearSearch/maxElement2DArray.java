package com.linearSearch;


public class maxElement2DArray {
    static void main() {
        int[][] array2D = {
                {1,2,3},
                {4,5,6,7},
                {8,9,10,11,12,13,14},
                {16,17}
        };

        int ans = minElement(array2D);
        System.out.println(ans);
    }
    static int minElement(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] row : arr ) {
            for (int col : row) {
                if(col > max) {
                    max = col;
                }
            }
        }
        return max;
    }
}
