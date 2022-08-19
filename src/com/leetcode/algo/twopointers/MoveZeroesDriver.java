package com.leetcode.algo.twopointers;

import java.util.Arrays;

/**
 * @author Vel
 * @date 19/08/22 : 13:19
 * Question link : https://leetcode.com/problems/move-zeroes/
 * Question name : Move zeroes
 * Question desc :
 * Given an integer array nums, move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */
public class MoveZeroesDriver {
    public static void main(String[] args) {

//        int[] nums = {0,1,0,3,12};//TestCase #
//        int[] nums = {0,0,0,0,0,3,4,5};//TestCase #
        int[] nums = {0,0,0,1,2,0,0,3,4,5};//TestCase #3 zeroes in alternate indices
//        int[] nums = {0};//TestCase #4 single zero - PASS
//        int[] nums = {1};//TestCase #
//        int[] nums = {};//TestCase #
//        int[] nums = {};//TestCase #
//        int[] nums = {};//TestCase #

        ZeroMoverTools zeroMoverTools = new ZeroMoverTools();
        zeroMoverTools.moveZeroes(nums);
        Arrays.stream(nums).forEach(currentElement -> {
            System.out.print(currentElement + " ");
        });
        System.out.println();
    }
}

class ZeroMoverTools {
    public void moveZeroes(int[] nums) {
        int zeroPointer = 0;
        for(int loopIndex = 0; loopIndex < nums.length; loopIndex++){
            if(nums[loopIndex] == 0){
                zeroPointer++;
            }
            //To handle edge case of single element array (non-zero)
            else if(zeroPointer != 0){
                nums[loopIndex - zeroPointer] = nums[loopIndex];
                nums[loopIndex] = 0;
            }
        }
    }
}
