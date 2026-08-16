package com.Basics;

import java.util.Scanner;
// 0 1 1 2 3 5 8 13
public class Fibonacci {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        int a = 0 , b = 1, c = 0;
        int n = 5;
        if(sc.hasNextInt()){
            n = sc.nextInt();
        }
        else{
            sc.next();
        }

        if(n == 1 ) c = a;
        if(n ==2) c = b;
        if(n>2){
            int count = 3;
           while(count++ <= n){
              c = a+b;
              a= b;
              b=c;
           }
        }

        System.out.println(c);

    }
}
