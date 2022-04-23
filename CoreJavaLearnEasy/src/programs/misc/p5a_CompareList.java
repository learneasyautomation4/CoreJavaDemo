package programs.misc;

import java.util.Arrays;

public class p5a_CompareList {
    public static void main(String[] args) {
        int[] a = {10, 20};
        int[] b = {10, 20};

        if (Arrays.equals(a, b)){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays NOT equal");
        }
    }
}