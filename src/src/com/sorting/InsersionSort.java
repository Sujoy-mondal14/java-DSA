package com.sorting;

import java.util.Arrays;

public class InsersionSort {
    static void main() {
        int[] arr = {3,5,2,4,1};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr) {
        for(int i = 0 ; i < arr.length-1; i++) { // loop runs from 0 to (N-2)
            for(int j = i +1; j > 0 ;  j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
