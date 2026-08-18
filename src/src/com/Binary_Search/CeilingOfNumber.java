package com.Binary_Search;

public class CeilingOfNumber {
    //ceiling mean the smallest element array but not greater or equal to the target element
    static void main() {
        int[] arr = {2,4,8,12,14,18,20};
        int target = 1;
        System.out.println(celingofNumber(arr, target));
    }

    static int celingofNumber(int[] arr, int target){
        //if the target element is greater than max element of array
        if(target > arr[arr.length-1]) return arr[arr.length-1];

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + ( end-start)/2 ;

            if(arr[mid]== target) return arr[mid];

            if(target > arr[mid]) start = mid +1 ;
            else if (target < arr[mid]) end = mid - 1 ;
        }

        return arr[start];
    }
}
