package programs.arrays;

public class p7_InsertElement {
    public static void main(String[] args) {
        int [] arr = {10, 20, 40, 50, 60};
        int pos = 3; //3rd position to insert element
        int element = 300; //this element to be inserted

        //i=arr.length-1 (traverse from backward). i>pos-1 (till this position)
        for(int i=arr.length-1; i>pos-1; i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=element;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
