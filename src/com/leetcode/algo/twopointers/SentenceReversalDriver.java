package com.leetcode.algo.twopointers;

/**
 * @author Vel
 * @date 09/09/22 : 20:31
 * Question link : https://leetcode.com/problems/reverse-words-in-a-string-iii/?envType=study-plan&id=algorithm-i
 * Question name : Reverse Words in a String III
 * Question desc :
 */
public class SentenceReversalDriver {
    public static void main(String[] args) {

//        String inputString = "Let's take LeetCode contest";//Test case#1 - Average case - PASS
//        String inputString = "abcd";//TestCase #2 - single word only - PASS
//        String inputString = "a";//TestCase #3 - single char word & single word only - PASS
//        String inputString = "God Ding";//TestCase #4 leetcode test case - PASS
        String inputString = "A B C D E F G H I J";//TestCase #5 multi single char words
        //String inputString = "";//TestCase #
        //String inputString = "";//TestCase #
        //String inputString = "";//TestCase #
        //String inputString = "";//TestCase #
        //String inputString = "";//TestCase #
        SentenceReversalTools sentenceReversalTools = new SentenceReversalTools();
        String reversedSentence = sentenceReversalTools.reverseWords(inputString);
        System.out.println("reversedSentence : " + reversedSentence);
    }
}

class SentenceReversalTools {
    public String reverseWords(String s) {

        char[] sentenceChars = s.toCharArray();

        int left = 0;
        int right = 0;

        while(left < sentenceChars.length){

            if(sentenceChars[right] == ' '){
                reverseWord(sentenceChars, left, right-1);
                left = right+1;
                right++;
            }
            else if(right == sentenceChars.length-1){
                reverseWord(sentenceChars, left, right);
                break;
            }
            else {
                right++;
            }
        }
        return new String(sentenceChars);
    }

    public void reverseWord(char[] sentence, int left, int right){
        while(left < right){
            char temp = sentence[left];
            sentence[left++] = sentence[right];
            sentence[right--] = temp;
        }
    }
}
