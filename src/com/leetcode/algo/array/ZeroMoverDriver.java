package com.leetcode.algo.array;

/**
 * @author Vel
 * @date 05/09/22 : 23:05
 * Question link : https://leetcode.com/problems/move-zeroes/?envType=study-plan&id=algorithm-i
 * Question name : Move zeroes
 * Question desc :
 */
public class ZeroMoverDriver {
    public static void main(String[] args) {

    }
}

class ZeroMover {
    public void moveZeroes(int[] nums) {

        int zeroCount = 0;

        for(int loopIndex = 0; loopIndex < nums.length; loopIndex++){
            if(nums[loopIndex] == 0) {
                zeroCount++;
            }
            else if(zeroCount > 0){
                nums[loopIndex - zeroCount] = nums[loopIndex];
                nums[loopIndex] = 0;
            }
        }
    }
}