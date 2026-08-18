package com.Binary_Search;

public class OrderAgnosticBinarySearch {
    static void main() {
        int[] arrAssending = {-23,-17,-6,4,7,12, 70 ,87, 89, 555};
        int[] arrDesending = {555,89,87,70,12,7,4,-6,-17,-23};

        int target = 70;

        System.out.println(orderAgnosticBinarySearch(arrAssending, target));
        System.out.println(orderAgnosticBinarySearch(arrDesending, target));
    }

     /*
        return the index of the target element,
        if  no element == target element return -1
    */
    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAssending = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end-start)/2 ;

            if(arr[mid] == target) return mid;

            if(isAssending){
                if(target> arr[mid]) start = mid +1 ;
                else if(target <  arr[mid]) end = mid-1;
            }
            else{
                if(target > arr[mid]) end = mid -1;
                else if(target < arr[mid]) start = mid + 1;
            }
        }

        return -1;
    }
}
