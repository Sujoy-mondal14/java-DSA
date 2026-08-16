package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LoopInArray {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        //Reading array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //writing array
            //using loops:
            for(int i : arr){
                System.out.print( i + " ");
            }
        System.out.println();
            //using .toString()
            System.out.print(Arrays.toString(arr));

    }
}
