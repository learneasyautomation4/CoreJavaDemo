package programs.misc;

import java.util.Scanner;

public class p5_CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sc1 = sc.nextLine();
        System.out.println("Enter string 1: " + sc1);
        String sc2 = sc.nextLine();
        System.out.println("Enter string 2: " + sc2);
        if (sc1.compareTo(sc2) > 0) {
            System.out.println("String 1 is greater");
        } else if (sc1.compareTo(sc2) < 0) {
            System.out.println("String 2 is greater");
        } else {
            System.out.println("Both are equal");
        }
    }
}

