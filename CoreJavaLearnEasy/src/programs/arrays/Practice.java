package programs.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
       String str="HELLO yes";
int count=1;
       for(int i=0; i<str.length(); i++){
           if(str.charAt(i)==0){
               count++;
           }
       }
        System.out.println(count);
    }
}