package programs.misc;

import java.util.Scanner;

public class p13_CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String name = sc.nextLine();
        int count=0;
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)!=' ')
                count++;
        }
        System.out.println("Total number of characters in a string: " + count);

    }
}
