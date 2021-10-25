package programs.arrays;
//Program to print the duplicate elements of an array

public class p6_DuplicateElements {
    public static void main(String[] args) {
        int [] arr={1, 2, 3, 2, 4, 5, 6, 6};
        System.out.println("Duplicate elements in an array: ");

        //Searches for duplicate element
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
