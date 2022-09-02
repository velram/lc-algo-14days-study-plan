package com.leetcode.algo.binarysearch;

/**
 * @author Vel
 * @date 02/09/22 : 20:06
 * Question link : https://leetcode.com/problems/first-bad-version/
 * Question name : first bad version
 * Question desc :
 */
public class BadVersionDriver {
    public static void main(String[] args) {

    }
}

class BadVersionFinder {
    public int firstBadVersion(int n) {

        int start = 1;
        int end = n;

        while(start < end){
            int mid = start + (end - start)/2;

            if(isBadVersion(mid)){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return end;
    }

    public boolean isBadVersion(int number){
        return true;
    }
}
