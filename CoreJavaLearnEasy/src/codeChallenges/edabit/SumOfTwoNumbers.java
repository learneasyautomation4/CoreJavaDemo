package codeChallenges.edabit;

import java.util.Scanner;

/**
 * ======================
 * https://edabit.com/challenge/8Ty2vq2YtcBp6CFc8
 * ======================
 * Return the Sum of Two Numbers
 * Create a method that takes two integers as arguments and returns their sum.
 * <p>
 * Examples
 * SumOfTwoNumbers(3, 2) ➞ 5
 * <p>
 * SumOfTwoNumbers(-3, -6) ➞ -9
 * <p>
 * SumOfTwoNumbers(7, 3) ➞ 10
 * Notes
 * Don't forget to return the result.
 */
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = sumOfTwoNumber(num1, num2);
        System.out.println(sum);
    }

    public static int sumOfTwoNumber(int a, int b) {
        int sum=a+b;
        return a + b;
    }

}