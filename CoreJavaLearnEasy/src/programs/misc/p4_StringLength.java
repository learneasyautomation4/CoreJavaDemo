package programs.misc;

import java.util.Scanner;

public class p4_StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println(name.length());
    }
}
