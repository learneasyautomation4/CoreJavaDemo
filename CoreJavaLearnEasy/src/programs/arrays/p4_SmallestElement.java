package programs.arrays;
//Program to print the smallest element in an array

public class p4_SmallestElement {
    public static void main(String[] args) {
        int [] arr={98,34,22,54,11,6};

        //Initialize min with first element in an array
        int min=arr[0];

        //Loop through the array
        for(int i=0;i<arr.length;i++){
            //Compare elements of array with min
            if(arr[i]<min)
                min=arr[i];
        }
            System.out.println("Smallest number: " +min);
    }
}

