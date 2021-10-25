package programs.arrays;
//Program to print the sum of all the items of the array

public class p5_SumArrays {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,3,2,1};
        int sum = 0;

        //Loop through the array to calculate sum of elements
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of arrays is: " +sum);
    }
}
