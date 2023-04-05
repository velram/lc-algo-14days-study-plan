package com.leetcode.algo.array;

/**
 * @author Vel
 * @date 06/09/22 : 21:16
 * Question link : https://leetcode.com/problems/reverse-string/?envType=study-plan&id=algorithm-i
 * Question name : Reverse String
 * Question desc :
 */
public class StringReverseDriver {
    public static void main(String[] args) {

        char[] input = {'a','b','c','d','e'};
        StringReverseTools stringReverseTools = new StringReverseTools();
        System.out.println("Input string : " + new String(input));
        stringReverseTools.reverseString(input);
        System.out.println("Reversed string : " + new String(input));
    }
}

class StringReverseTools {
    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;

        while(start < end){
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }

    }
}