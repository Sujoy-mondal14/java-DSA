package com.linearSearch;

public class LinearSearch {

    static void main() {
        int[] arr = { 3,789,57,234,9,456,1,7};
        int target = 7;
        int index = linearSearch(arr, target);
        boolean isFound = linearSearchIsFound(arr, target);

        System.out.println(index + " " + isFound);
    }

    //element is found or not;
    static boolean linearSearchIsFound(int[] arr, int target) {

        //here no need of length check:
        // forEach loop does nothing while arr.length == 0
        for(int num : arr){
            if(num == target) return true;
        }

        return false;
    }

    // search in an array , if found return index
    // not found return -1; here we are returning the index value
    static int linearSearch(int[] arr , int target){
        if(arr.length == 0) return -1;

        for (int index = 0; index < arr.length; index++) {
            // check for every element == target or not
            if(arr[index] == target){
                return index+1;
            }
        }
        //if no target element found
        return -1;
    }
}
