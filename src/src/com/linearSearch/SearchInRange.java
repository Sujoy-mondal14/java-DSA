package com.linearSearch;

public class SearchInRange {
    static void main() {
        int[] arr = { 3,789,57,234,9,456,1,7};
        int target = 9;

        //Range Define:
        int start  = 2;
        int end = 6;

        boolean isfound = linearSearch(arr, target, start, end);
        System.out.println(isfound);
    }

    static boolean linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0) return false;

        for(int idx = start; idx <= end; idx++){
            if(arr[idx] == target) return true;
        }
        return false;
    }
}
