package codeChallenges.InterviewsAttended;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a program to find occurance of each character in given String
 * Input: Hello
 * output:
 * H -1
 * e-1
 * l-2
 * 0-1
 */
public class FindOccurrenceOfEachCharacterInString {
    public static void main(String[] args) {
        String str="Hello";
        Map<Character,Integer> hMap= new HashMap<>();

        char[] charArray=str.toCharArray();

        for(char ch:charArray){
            if(!hMap.containsKey(ch)){
                hMap.put(ch,1);
            }else{
                int count=hMap.get(ch);
                hMap.put(ch,count+1);
            }
        }
        System.out.println(hMap);

    }
}