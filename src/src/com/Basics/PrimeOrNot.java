package com.Basics;
import java.util.Scanner;

public class PrimeOrNot {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = isPrime(n)?"Prime" : "not Prime";
        System.out.println("Your number is " + ans);
    }

    public static boolean isPrime(int n) {
        if(n<=1) return false;

        int c = 2;
        while(c*c <=n){
            if(n%c == 0){
                return false;
            }
            c++;
        }

        return c*c > n;
    }
}
