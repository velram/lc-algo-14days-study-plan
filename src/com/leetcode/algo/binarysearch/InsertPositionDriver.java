package com.leetcode.algo.binarysearch;

/**
 * @author Vel
 * @date 03/09/22 : 22:08
 * Question link : https://leetcode.com/problems/search-insert-position/
 * Question name : Find Insert position
 * Question desc :
 */
public class InsertPositionDriver {
    public static void main(String[] args) {


    }
}

class InsertPositionFinder {
    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = (start + end)/2;

            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
        }
        return start; 
    }
}