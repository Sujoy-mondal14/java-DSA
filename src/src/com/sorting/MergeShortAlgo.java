package com.sorting;

import java.util.Arrays;

public class MergeShortAlgo {
    static void main() {
        int[]  arr = {4,7,2,0,8,1,6,3,6};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1) return arr;

        int start = 0;
        int end = arr.length -1;
        int mid = start + (end-start)/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,start,mid+1));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid+1,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j < right.length) {
            arr[k] = right[j];
            k++;
            j++;
        }

        return arr;
    }
}
