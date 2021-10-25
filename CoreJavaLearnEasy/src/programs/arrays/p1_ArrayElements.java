package programs.arrays;
//Program to print the elements of an array

public class p1_ArrayElements {
    public static void main(String[] args) {
        int [] arr={0,1,2,3,4,5,6};

        System.out.println("Elements in an array are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
