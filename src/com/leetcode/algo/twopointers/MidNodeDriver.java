package com.leetcode.algo.twopointers;

/**
 * @author Vel
 * @date 23/08/22 : 21:47
 * Question link : https://leetcode.com/problems/middle-of-the-linked-list/
 * Question name : Find middle of the linked list
 * Question desc : Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
public class MidNodeDriver {
    public static void main(String[] args) {

    }
}

class MidNodeFinder {
    public ListNode middleNode(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        int listSize = 0;
        listSize = findListSize(head, listSize );
        int middleNodeIndex = 0;
        middleNodeIndex = findMiddleNodeIndex(listSize );
        int loopCounter = 1;
        while(loopCounter++ < middleNodeIndex){
            //System.out.println("loopCounter is at " + loopCounter);
            head = head.next;
        }

        return head;
    }
    public int findMiddleNodeIndex(int listSize){
        int middleNodeIndex = 0;
        if(listSize % 2 != 0){
            middleNodeIndex = (listSize + 1) / 2;
        }
        else {
            middleNodeIndex = (listSize / 2) + 1;
        }
        //System.out.println("middle node is at : " + middleNodeIndex);
        return middleNodeIndex;
    }

    public int findListSize(ListNode head, int listSize){
        int size = 0;
        while(head != null){
            head = head.next;
            size++;
        }
        return size;
    }
}


