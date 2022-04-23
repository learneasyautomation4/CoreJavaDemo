package programs.misc;

import java.util.Scanner;

public class p7_SwapWithTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first digit: ");
        int a = sc.nextInt();
        System.out.println("Enter second digit: ");
        int b = sc.nextInt();
        System.out.println("Before swap: " +a+ " " +b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: " +a+ " " +b);
    }
}
