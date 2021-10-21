package day13_Arrays;

import java.util.Arrays;

public class c1_arraysIntro {

    public static void main(String[] args) {
        //int ,double float
        //each variable has own value
        //if we want to store multiple values in one list

        int number1=1;
        int number2=2;
        int number3=3;
        //...
        //arrays : containers for multiple variables
        // as a container that will store multiple values inside
        //and it has ready methods where you can modify your variables

        //declaration of array
        //DataType [] nameofyourcontainer = {data1,data2,data3, .... }

        //container for numbers
        //integaer container
        int [] numbers= {100,2,5,955,10,25,3,7,9}; //this  is int array
        //you cannot store any other data type inside here
        //array has index numbers
                     /// 0   1  2  3  4  5 6 7 8

        //printing third number (index 2 )
        System.out.println(numbers[2]);

        int firstNumber=numbers[0];
        System.out.println(firstNumber);

//        System.out.println(numbers[9]);//ArrayIndexOutOfBoundsException error

        //one way of declaring an array
        int rollNo[]=new int[5];

        rollNo[0]=852;
        rollNo[1]=202;
        rollNo[2]=425;
        rollNo[3]=345;
        rollNo[4]=678;

        for(int i=0; i<rollNo.length;i++){
            System.out.println("Array value at the index " + i + ":" + rollNo[i]);
        }

        String names[] = new String[3];
        names[0]="Sangeetha";
        names[1]="Nila";
        names[2]="Ashwin";

        for(int i=0; i<names.length;i++){
            System.out.println("Array value at the index " + i + ":" + names[i]);
        }


        Double d[]=new Double[10];

        Byte bArr[]=new Byte[4];

        //second way to represent array
        int days[] = new int[]{58,56,32,74,85,96,85,24,53,62,74,85};

        String nameArr[] = new String[]{"Kavitha","Nila","Sangeeta","Ashwin"};
        System.out.println("Size:" + nameArr.length);

//        System.out.println(nameArr); //wrong notation

        for(int i=0; i<nameArr.length;i++){
            System.out.println("Array value at the index " + i + ":" + nameArr[i]);
        }


        //third way of declaring array
        String nameArr1[]={"Anacodan","python","java","c++"};

        for(int i=0; i<nameArr1.length;i++){
            System.out.println("before sorting- Array value at the index " + i + ":" + nameArr1[i]);
        }
        Arrays.sort(nameArr1);


        for(int i=0; i<nameArr1.length;i++){
            System.out.println("after sorting: Array value at the index " + i + ":" + nameArr1[i]);
        }


    }
}
