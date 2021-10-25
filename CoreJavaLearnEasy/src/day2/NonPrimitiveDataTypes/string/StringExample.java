package day2.NonPrimitiveDataTypes.string;

public class StringExample {
    public static void main(String[] args) {
        //one way of representation for declaring string
        // string literal
        String name_1="Nila";
        String name_2="Avanthi";
        String name_3="Avanthi";

        //second way - new keyword
        String str=new String("Kavitha");
        String str1=new String("Avanthi");


       String name_4= str.intern();
       System.out.println(name_4);

    }
}
