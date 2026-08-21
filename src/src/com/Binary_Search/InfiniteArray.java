package com.Binary_Search;

public class InfiniteArray {
    static void main() {
        int[] arr = { 3, 5, 7,9,10, 67 , 88, 90 , 96 , 99 , 107, 114 , 166, 174 , 190, 200};
        int target = 107;
        System.out.println(ans(arr,target));
    }

    static int binarySearch(int[] arr, int target, int start , int end) {
        while(start <= end) {
            int mid = start + (end - start)/2 ;

            if(target > arr[mid]) start = mid +1;
            else if(target < arr[mid]) end = mid -1;
            else return mid;
        }

        return -1;
    }

    static int ans(int[] arr, int target) {
        // first find the range
        // start with a box size of 2
        int start = 0;
         int end = 1;

         // condition for the target to lie in the range is target < end or not
        // because if the target is already less than end it will be greater than all previous start element
        //so while the target < end , double the search range

        while(target > arr[end]) {
            int newStart = end+1; // newStart is like temp
            //double the box value;
            // end = previousEnd + sizeofBox * 2;
            end = end+ (end - start + 1) * 2;
            start = newStart;

        }

        return binarySearch(arr, target, start, end);
    }
}
