package codeChallenges.hackerrank;

import java.util.Scanner;

/**
 * =================
 * https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
 * =================
 * In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.
 *
 * Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.
 *
 * Input Format
 *
 * There are three lines of input:
 *
 * The first line contains an integer.
 * The second line contains a double.
 * The third line contains a String.
 * Output Format
 *
 * There are three lines of output:
 *
 * On the first line, print String: followed by the unaltered String read from stdin.
 * On the second line, print Double: followed by the unaltered double read from stdin.
 * On the third line, print Int: followed by the unaltered integer read from stdin.
 * To make the problem easier, a portion of the code is already provided in the editor.
 *
 * Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
 *
 * Sample Input
 *
 * 42
 * 3.1415
 * Welcome to HackerRank's Java tutorials!
 * Sample Output
 *
 * String: Welcome to HackerRank's Java tutorials!
 * Double: 3.1415
 * Int: 42
 * =================
 * In Scanner class if we call nextLine() method after any one of the seven nextXXX() method then the nextLine() doesn’t not read values from console and cursor will not come into console it will skip that step. The nextXXX() methods are nextInt(), nextFloat(), nextByte(), nextShort(), nextDouble(), nextLong(), next().
 *
 * That's because the Scanner class' nextInt() method does not consume the last newline character of your input, and thus that newline is consumed in the next call to Scanner class' nextLine().
 *
 * You can fire a blank Scanner class' nextLine() call after Scanner#nextInt to consume the rest of that line including newline
 *
 * int option = input.nextInt();
 * input.nextLine();  // Consume newline left-over
 * String str1 = input.nextLine();
 */
public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Integer Number: ");
        int intValue = sc.nextInt();
        System.out.println("Enter Double Number: ");
        Double doubleValue= sc.nextDouble();
        sc.nextLine(); // Consume newline left-over
        System.out.println("Enter String: ");
        String stringValue=sc.nextLine();
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
    }
}