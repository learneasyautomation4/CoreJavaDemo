package codeChallenges.edabit;

import java.util.Scanner;

/**
 * ========================================
 * https://edabit.com/challenge/Qir2pQ2Qp3uwrfJNZ
 * ==========================================
 * Return the Next Number from the Integer Passed
 * Create a function that takes a number as an argument, increments the number by +1 and returns the result.
 *
 * Examples
 * addition(0) ➞ 1
 *
 * addition(9) ➞ 10
 *
 * addition(-3) ➞ -2
 */
public class ReturnNextNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: " );
        int num=sc.nextInt();
        int nextNumber=addition(num);
        System.out.println(nextNumber);
    }

    public static int addition(int a){
        return a+1;
    }
}