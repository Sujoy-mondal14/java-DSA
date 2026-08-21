package com.Binary_Search;

public class FloorOfNumber {
    static void main() {
        int[] arr = {2,4,8,12,14,18,20};
        int target = 99;
        System.out.println(floorOfNumber(arr, target));
    }
    static int floorOfNumber(int[] arr, int target) {
        //if taget element is smaller than the smallest element of the array
        if(target < arr[0]) return Integer.MIN_VALUE;

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end -start)/2;

            if(arr[mid] == target) return target;

            if(target > arr[mid]) start = mid + 1;
            else if(target < arr[mid]) end = mid -1;
        }

        return arr[end];
    }
}
