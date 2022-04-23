package programs.arrays;

public class p8_ReverseOrder {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40};

        for (int i=0; i< arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        for (int i= arr1.length-1; i>=0; i-- ){
            System.out.print(arr1[i] + " ");
        }
    }
}
