package com.leetcode.algo.array;

/**
 * @author Vel
 * @date 04/09/22 : 13:21
 * Question link : https://leetcode.com/problems/rotate-array/?envType=study-plan&id=algorithm-i
 * Question name : Rotate array
 * Question desc :
 */
public class ArrayRotateDriver {
    public static void main(String[] args) {

    }
}

class ArrayRotateTools {
    public void rotate(int[] nums, int k) {
    //Swap array elements from 0 to n
        reverseArray(nums, 0, nums.length-1);
    //Swap elements from 0 to k-1
        reverseArray(nums, 0, k-1);
    //Swap elements from k to n
        reverseArray(nums, k, nums.length-1);
    }

    public void reverseArray(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}