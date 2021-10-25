package day2.NonPrimitiveDataTypes.array;

import java.lang.reflect.Array;

public class ArraysExample {

    public static void main(String[] args) {
        //declaration of array with size 3
        //one way of representing array
       int numbers[]=new int[3];

       //assigning values to the array
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;

        System.out.println("First number:" + numbers[0]);
        System.out.println("Second number:" + numbers[1]);
        System.out.println("Third number:" + numbers[2]);

        //finding the array size
        int size=numbers.length;

        //traversing array
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }


        String str[]=new String[5];
        str[0]="kavihta";
        str[1]= "Avanthi";
        str[2]="nila";
        str[3]="anitha";
        str[4]= "Mogith" ;

        for(int i=0;i<str.length; i++){
            System.out.println("Names: " + str[i]);
        }

        //another way of representing array
        int numbersArr[]={20,40,50,70,100,34,78};
        System.out.println("Size is:" +numbersArr.length);

        for(int i=0;i<numbersArr.length; i++){
            System.out.println("Numbers: " + numbersArr[i]);
        }


        //third way representing array
        int numbersArray[]=new int[]{20,40,50,70,100,34,78};

        for(int i=0;i<numbersArray.length; i++){
            System.out.println("Numbers: " + numbersArr[i]);
        }

        //System.out.println("array values for intergers: " + numbersArray[7]); //array out of index
    }




}
