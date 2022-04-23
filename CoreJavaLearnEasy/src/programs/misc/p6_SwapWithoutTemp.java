package programs.misc;

import java.util.Scanner;

public class p6_SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first digit: ");
        int a = sc.nextInt();
        System.out.println("Enter second digit: ");
        int b = sc.nextInt();
        System.out.println("Before swap: " +a+ "\t" +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap: " +a+ "\t" +b);
    }
}
