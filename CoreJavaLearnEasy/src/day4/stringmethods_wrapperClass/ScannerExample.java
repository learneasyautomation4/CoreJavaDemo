package day4.stringmethods_wrapperClass;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        int age;

        //Scanner - to recieve the input from teh user through conslole
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter age: ");
        //nextByte()
        Byte b1 = sc.nextByte();


        System.out.println("Age is: " + b1);

        //nextShort()
        System.out.println("Please enter your favorite number: ");
        Short sh=sc.nextShort();
        System.out.println("Short: " + sh);

        //nextInt()
        System.out.println("Please enter your date of year: ");
        Integer i1=sc.nextInt();
        age=sc.nextInt();
        System.out.println("Integer value: " + i1);

        //nextLong()
        System.out.println("Enter your salary: ");
        Long l1=sc.nextLong();
        System.out.println("Long value is: " + l1);

        //nextFloat()
        System.out.println("Enter your height: ");
        Float f=sc.nextFloat();
        System.out.println("Float :" +f);

        //nextDouble
        System.out.println("Enter your weight: ");
        Double d=sc.nextDouble();
        System.out.println("Double number: " + d);

        //nextBoolean()
        System.out.println("whether you like session?");
        Boolean b= sc.nextBoolean();
        System.out.println("Boolean value: " + b);

        //next()
        System.out.println("Enter your favourtite colors");
        String s=sc.next();
        System.out.println("String value: " + s );



    }
}
