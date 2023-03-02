package codeChallenges.InterviewsAttended;

import java.util.Scanner;

/**
 * reverse the words in the given sentence
 *
 * Input: I love my india
 * output: india my love I
 *
 */
public class ReverseStringInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence..");
        String originalSentence = sc.nextLine();
        System.out.println("Original Sentence is:  " + originalSentence);
        String[] originalArray = originalSentence.trim().split(" ");
        System.out.println("Original string length is: " + originalArray.length);
        ReverseStringInSentence obj = new ReverseStringInSentence();
        obj.reverseString(originalArray);
//        obj.reverseString1(originalArray);

    }

    //working
    private void reverseString(String[] originalSentence) {
        int counter = 0;
        String[] reversedArray = new String[originalSentence.length];
        for (int i = originalSentence.length - 1; i >= 0; i--) {
            reversedArray[counter] = originalSentence[i];
            originalSentence[i] = " ";
            counter++;
        }
        System.out.println("Reversed string in a sentence is: ");
        for (String str : reversedArray) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println("Result string length is: " + originalSentence.length);
    }

    //another way - it is not working
    private void reverseString1(String[] originalSentence) {
        String resultString="";
        for (int i = originalSentence.length - 1; i >= 0; i++) {
            resultString=resultString+originalSentence[i]+" ";
        }
        System.out.println("Result is: " + resultString.substring(0,resultString.length()-1));
    }

}