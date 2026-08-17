package com.linearSearch;

public class MinElementArray {
    static void main() {
        int[] arr = { 3,789,57,234,9,456,1,7};
        int ans = minElement(arr);
        System.out.println(ans);
    }

    static int minElement(int[] arr) {
        // assume array.length != 0;

        int min = arr[0];
        for(int num : arr){
            if(num < min) min = num;
        }

        return min;
    }
}
