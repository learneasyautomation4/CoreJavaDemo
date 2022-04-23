package programs.misc;

import java.util.Scanner;

public class p2_ReverseString {
    //one way
//    public static void main(String[] args) {
//        String name = "Computer";
//        int len = name.length();
//        String rev = "";
//        for (int i = len - 1; i >= 0; i--) {
//            rev = rev+name.charAt(i);
//        }
//        System.out.println(rev);
//    }

    public static void main(String[] args) {
        String name = "Sangeeta";
        int len = name.length();
        String rev = "";
        for(int i=len-1; i>=0; i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
    }

//    //other way using StringBuilder class
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any string: ");
//        String name = sc.nextLine();
//        StringBuilder str2 = new StringBuilder();
//        str2.append(name);
//        str2=str2.reverse();
//        System.out.println(str2);
//    }
}
