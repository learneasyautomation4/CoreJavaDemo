package programs.arrays;

public class p12_ArrayEvenElements {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};

        for(int i=1; i<arr.length; i=i+2){
            System.out.println(arr[i]);
        }
    }
}
