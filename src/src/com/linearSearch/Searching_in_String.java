package com.linearSearch;

import java.util.Arrays;

public class Searching_in_String {
    static void main() {
        String name = "sujoy";
        System.out.println(Arrays.toString(name.toCharArray()));

        char target ='j';
        boolean isfound = linearSearch(name, target);
        System.out.println(isfound);
    }

    private static boolean linearSearch(String name, char target) {
        for(char ch : name.toCharArray()){
            if(ch == target) return true;
        }
        return false;
    }

}
