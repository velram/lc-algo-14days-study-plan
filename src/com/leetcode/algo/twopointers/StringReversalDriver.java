package com.leetcode.algo.twopointers;

import java.util.Arrays;

/**
 * @author Vel
 * @date 20/08/22 : 16:19
 * Question link : https://leetcode.com/problems/reverse-string/
 * Question name : Reverse String
 * Question desc :
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 *
 *
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 */
public class StringReversalDriver {
    public static void main(String[] args) {

        char[] input = {'h','e','l','l','o'};//Test case#
//        char[] input = {};//Test case#
//        char[] input = {};//Test case#
//        char[] input = {};//Test case#
//        char[] input = {};//Test case#
//        char[] input = {};//Test case#
//        char[] input = {};//Test case#
//        char[] input = {};//Test case#
        System.out.println("String before reversal : ");
        printCharArray(input);
        StringReverseTools stringReverseTools = new StringReverseTools();
        stringReverseTools.reverseString(input);
        System.out.println("String After reversal : ");
        printCharArray(input);

    }

    private static void printCharArray(char[] input) {
        for(char currentChar : input){
            System.out.print(currentChar);
        }
        System.out.println();
    }
}

class StringReverseTools{
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}