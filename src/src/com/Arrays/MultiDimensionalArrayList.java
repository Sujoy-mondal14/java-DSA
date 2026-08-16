package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> arraylist2D = new ArrayList<>();
        
        //initialization
        for (int row = 0; row < 3; row++) {
            arraylist2D.add(new ArrayList<>());
        }
        
        //add element
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                arraylist2D.get(row).add(sc.nextInt());
            }
        }

        //output elements:
        System.out.println(arraylist2D);
    }
}
