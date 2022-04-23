package programs.misc;

import java.util.Scanner;

public class p9_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 1;
        System.out.println("Fibonacci series: ");
        for(int i=0; i<num; i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(a+ " ");
        }

    }
}
