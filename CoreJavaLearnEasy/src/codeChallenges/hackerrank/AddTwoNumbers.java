package codeChallenges.hackerrank;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number total number of test cases: ");
        int totalNumberOfTestCases = sc.nextInt();
        for(int i=0; i<totalNumberOfTestCases;i++){
            System.out.println("Enter first number: ");
            int num1= sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.print("Total of two numbers: ");
            int total= num1+num2;
            System.out.println(total);
        }
    }
}