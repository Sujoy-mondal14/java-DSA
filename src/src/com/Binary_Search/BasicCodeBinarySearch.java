package com.Binary_Search;

public class BasicCodeBinarySearch {
    //binary search is for only shorted data
    static void main() {
        int[] arrAssending = {-23,-17,-6,4,7,12, 70 ,87, 89, 555};
        int[] arrDesending = {555,89,87,70,12,7,4,-6,-17,-23};
        int target = 87;

        System.out.println(binarySearch_Asending(arrAssending, target));
        System.out.println(binarySearch_Descending(arrDesending, target));
    }

    /*
        return the index of the target element,
        if  no element == target element return -1
    */
    static int binarySearch_Asending(int[] arr, int target){
        int start =0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start +(end- start)/2 ; // this is an optimize way to find mid.
            // mid = (start+end)/2 ; may exceed ints limit but above would not;

            if(arr[mid] > target){ // target exist on the right hand side
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return mid; // element found
            }
        }

        return -1; // element not found;
    }

    static int binarySearch_Descending(int[] arr, int target){
        int start =0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start +(end- start)/2 ; // this is an optimize way to find mid.
            // mid = (start+end)/2 ; may exceed ints limit but above would not;

            if(arr[mid] > target){ // target exist on the left hand side
                start = mid + 1;
            }else if(arr[mid] < target){ // target exist on the right hand side
                end = mid - 1;
            }else{
                return mid; // element found
            }
        }

        return -1; // element not found;
    }
}

