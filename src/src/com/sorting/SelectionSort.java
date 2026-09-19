package com.sorting;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int[] arr = { 3,5,1,2,4};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
        for(int i = 0;i < arr.length; i++) {
            int lastIdxUnSorted = arr.length -1 - i;
            int maxIdxUnSorted = findMaxUnSortedIdx(arr,0,lastIdxUnSorted);
            int temp = arr[maxIdxUnSorted];
            arr[maxIdxUnSorted] =arr[lastIdxUnSorted];
            arr[lastIdxUnSorted] = temp;
        }
    }

    static int findMaxUnSortedIdx(int[] arr, int start, int lastIdxUnSorted) {
        int max = start; // let the staring idx holds the max element
        for(int i = start; i <= lastIdxUnSorted; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
