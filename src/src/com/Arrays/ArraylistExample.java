package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    static void main() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        //input
        for(int i =0 ; i<5; i++){
            list.add(in.nextInt());
        }

        //output
            //method 1:
                System.out.println(list);
            //method 2:
        for (int row = 0; row < 5; row++) {
            System.out.print(list.get(row)+ " ");
        }
    }
}
