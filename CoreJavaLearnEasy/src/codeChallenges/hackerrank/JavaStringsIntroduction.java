package codeChallenges.hackerrank;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1=sc.next();
        System.out.println("Enter another string: ");
        String str2= sc.next();
        int str1Length = str1.length();
        int str2Length = str2.length();
        System.out.println(str1Length+str2Length);
        if(str1.compareTo(str2) >str2.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        str1=str1.substring(0,1).toUpperCase() + str1.substring(1); //capitalize the first letter alone
        str2=str2.substring(0,1).toUpperCase() + str2.substring(1); //capitalize the first letter alone
        System.out.println(str1 + " " + str2);
    }
}