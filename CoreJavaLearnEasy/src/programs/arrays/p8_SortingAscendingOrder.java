package programs.arrays;

public class p8_SortingAscendingOrder {
    public static void main(String[] args) {
        int [] originalArray = {43, 66, 11, 87, 9};
        int temp = 0;

        System.out.print("Original array: ");
        for(int i=0; i< originalArray.length; i++){
            System.out.print(originalArray[i] + " ");
        }

        for(int i=0; i< originalArray.length; i++){
            for(int j=i+1; j< originalArray.length; j++){
                if(originalArray[i]>originalArray[j]){
                    temp=originalArray[i];
                    originalArray[i]=originalArray[j];
                    originalArray[j]=temp;
                }
            }
        }

        System.out.println();
        System.out.print("Ascending order: ");
        for(int i=0; i< originalArray.length; i++){
            System.out.print(originalArray[i] + " ");
        }
    }
}
