package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    static void main() {
        //type 1 declaration->
        int[][] arr = new int[3][]; // row must be defined but column may or may not be defined.
        //type 2 declaration->
        int[][] arr2D = {
                {1,2,3},
                {4,5},
                {5,7,8,9}
        };

        //input 2D array
        Scanner in = new Scanner(System.in);
        int[][] array = new int[3][2];

        for(int row = 0; row<array.length; row++){
            //for each row take input of each column
            for(int col = 0; col< array[row].length; col++){
                array[row][col] = in.nextInt();
            }
        }

        //output 2D array
            //method one
            for (int[] row : array) {
                for (int col : row) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
            //method 2:
            for(int[] row : array){
                System.out.println(Arrays.toString(row));
            }

    }
}
