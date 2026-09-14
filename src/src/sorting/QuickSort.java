package sorting;

import java.util.Arrays;

public class QuickSort {

    static void main() {
        int[] arr = { 4,8,1,0,3,2,7};
        quickSort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int high, int low){
        if(low >= high) return;

        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];

        while(start <= end){
            while(pivot > arr[start]) start++;
            while(pivot< arr[end]) end--;

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] =temp;
                start++;
                end--;
            }

        }

        // now pivot is at its correct position . now sort the other two half
        quickSort(arr, end,low);
        quickSort(arr,high, start);
    }
}
