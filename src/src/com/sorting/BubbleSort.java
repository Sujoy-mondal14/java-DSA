package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for(int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if(!swap)
                break;
        }
    }
}
