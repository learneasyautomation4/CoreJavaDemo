package programs.arrays;

import java.util.Scanner;

public class p9_ArrayPosition {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();

        if(pos< arr.length){
            int element = arr[pos-1];
            System.out.println(element);
        }
    }
}
