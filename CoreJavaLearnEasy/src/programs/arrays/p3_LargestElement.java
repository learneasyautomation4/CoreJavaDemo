package programs.arrays;
//Program to print the largest element in an array

public class p3_LargestElement {
    public static void main(String[] args) {
        int [] arr={25,11,5,75,100};

        //Initialize max with first element in an array
        int max=arr[0];

        //Loop through the array
        for(int i=0;i<arr.length;i++){
            //Compare elements of array with max
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Largest element: " +max);

    }
}
