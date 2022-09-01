package codeChallenges.hackerrank;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.next();
        System.out.println("Enter start position: ");
        int start=sc.nextInt();
        System.out.println("Enter End position: ");
        int end=sc.nextInt();
        System.out.println("Start position is: " + start);
        System.out.println("End position is: " + end);
        String subStr=str.substring(start,end);
        System.out.println("Sub String: " + subStr);
        System.out.println(subStr);
    }
}