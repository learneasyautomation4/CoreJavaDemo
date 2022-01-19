package day4.stringmethods_wrapperClass;

import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {

        double d1=45.85963122;

        System.out.println("Double using primitive data type: " + d1);


        Scanner sc=new Scanner(System.in);

        //Wrapper class - Double  => its just a replacement of primitive data type

        //used in collections

        System.out.println("Enter your weight: ");
        Double d=sc.nextDouble();
        System.out.println("Double number: " + d);
    }
}
