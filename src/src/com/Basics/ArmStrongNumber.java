package com.Basics;

import java.util.Scanner;

public class ArmStrongNumber {
    // Armstrong number are those numbers where the cubic sum of individual digit of a number is same as the number
    /*
        Example: 153
                   (1)^3 + (5)^3 + (3)^3 = 1+125+27 = 153 , is an Armstrong number
    */
    static void main() {
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()){ // checks whether it has an integer input
            int n = sc.nextInt();
            String ans  = isArmStrong(n)? "ArmStrong" : "not Armstrong";
            System.out.println("Your number is "+ans);
        }
        else {
            threeDigitArmstrongNum(); // this gives all 3 digit Armstrong numbers
        }


    }

    private static void threeDigitArmstrongNum() {

        for (int i =100; i<=1000; i++){
            boolean res = isArmStrong(i);
            if(res){
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isArmStrong(int n) {
        int sum = 0;
        int num = n;
        while(n>0){
            int a = n%10;
            sum+=Math.powExact(a,3);
            n= n/10;
        }

        return sum == num;
    }
}
