package programs.misc;

import java.util.Scanner;

public class p1_ReverseNumber {
//    public static void main(String[] args) {
//        int num = 5432, rem, rev = 0;
//        while (num != 0) {
//            rem = num % 10;
//            rev = rev * 10 + rem;
//            num = num / 10;
//
//        }
//        System.out.println(rev);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int rem, rev=0;
        while (num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}