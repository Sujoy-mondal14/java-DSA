package com.Basics;

import java.util.Scanner;

public class Main {
   static void main() {
//       System.out.println("hello world");
//       System.out.println(464);
       Scanner sc = new Scanner(System.in);
//
//      System.out.println(sc.nextInt());
//
//       System.out.println(Integer.MAX_VALUE);
//
//        byte a = 50;
//        byte b = 40;
//        byte c = 100;
//        byte d = (byte) ( (a*b) / c);
//       System.out.println(d);
//
//       char ch = sc.next().trim().charAt(0);
//
//       System.out.println(ch);
       String a = "mango";
       String b = "apple";
//apple
//       if(a.equals("mango")){
//           System.out.println(1);
//       }else {
//           System.out.println(0);
//       }

       String s =  sc.next().trim();

//    if(s == "mango"){
//        System.out.println(1);;
//    }else{
//        System.out.println(0);
//    }
//    switch (s){
//        case "a":
//            System.out.println(1);
//            break;
//        case "b" :
//            System.out.println(2);
//            break;
//        case "c" :
//            System.out.println(3);
//            break;
//        default:
//            System.out.println(10);
//    }

       switch (s){
           case "a" -> System.out.println(1);
           case "b" -> System.out.println(2);
           default -> System.out.println(10);
       }

       sc.close();
    }
}