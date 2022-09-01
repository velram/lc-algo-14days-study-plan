package com.leetcode.algo.binarysearch;

/**
 * @author Vel
 * @date 01/09/22 : 20:15
 * Question link :
 * Question name :
 * Question desc :
 */
public class BinarySearchDriver {
    public static void main(String[] args) {

    }
}

class BinarySearchTools {
    public int search(int[] nums, int target){

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                right = mid-1;
            }
            else if(target > nums[mid]){
                left = mid + 1;
            }
        }

        return -1;
    }
}