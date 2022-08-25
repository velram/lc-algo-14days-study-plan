package com.leetcode.algo.array;

/**
 * @author Vel
 * @date 25/08/22 : 23:42
 * Question link :
 * Question name :
 * Question desc :
 */
public class MissingNumber {
    public static void main(String[] args) {


    }
}

class MissingNumberFinder {
    public int missingNumber(int[] nums) {

        int natuarlNumbersSum = (nums.length) * (nums.length + 1) / 2;
        int actualSum = 0;

        for(int loopIndex = 0; loopIndex < nums.length; loopIndex++){
            actualSum += (nums[loopIndex]);
        }
        return natuarlNumbersSum - actualSum;
    }
}