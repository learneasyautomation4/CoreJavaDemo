package programs;
//Program to copy all elements of one array into another array

public class CopyArray {
    public static void main(String[] args) {
        int [] arr1=new int[]{0,1,2,3,4};
        int [] arr2=new int[arr1.length];

        //Copying all elements of array 1 to array 2
        for (int i=0;i<arr1.length;i++){
            arr2=arr1;
        }

        //Elements of array 1
        System.out.println("Original array 1");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //Elements of array 2
        System.out.println("New array 2");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
