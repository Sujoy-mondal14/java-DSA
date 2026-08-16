package com.Arrays;

public class MaxElementOfArray {
    static void main() {
        int[] arr =  {24,56,9,28,90};

        //MAx element in a array
        int max = maxElement(arr);
        System.out.println("MAx Element: "+ max);

        //Max Element in a Range
        int index1 = 1;
        int index2 = 3;
        int result = maxInRange(arr,index1,index2);
        System.out.println("Max in range "+ index1 +" to "+ index2+ " is "+ result);

    }

     static int maxInRange(int[] arr, int index1, int index2) {
        //edge cases
        if(index1>index2) return -1;
        if(arr == null) return -1;


        int max = arr[index1];
        for(int num = index1; num <= index2; num++){
            max = Math.max(max,arr[num]);
        }
        return max;
    }

     static int maxElement(int[] arr) {
        //Edge case
        if(arr.length == 0) return -1;


        int max = arr[0];
        for(int num : arr){
            max = Math.max(num,max);
        }
        return max;
    }
}
