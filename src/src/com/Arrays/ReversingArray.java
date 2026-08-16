package com.Arrays;

import java.util.Arrays;

public class ReversingArray {
    static void main() {
        int[] arr = {23,6,435,97,13,64,42};
        System.out.println(Arrays.toString(arr));

        reverse(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(end > start){
            swap(arr,start,end);

            start++;
            end--;
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
