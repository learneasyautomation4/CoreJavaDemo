package programs.arrays;

import java.util.Arrays;
import java.util.Collections;

public class p13_ArrayOddElements {
    public static void main(String[] args) {
        int[] arr={10,20, 30, 40};

        for(int i=0; i<arr.length; i=i+2){
            System.out.println(arr[i]);
        }
    }
}
