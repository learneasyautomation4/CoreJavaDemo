package programs.arrays;

public class p11_DescendingSort {
    public static void main(String[] args) {
        int[] arr={34,22,55,11};
        int temp=0;

        System.out.println("Original array: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println();
        System.out.println("Descending order: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
