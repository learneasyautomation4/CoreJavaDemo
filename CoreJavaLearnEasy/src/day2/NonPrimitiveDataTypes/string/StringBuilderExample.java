package day2.NonPrimitiveDataTypes.string;

public class StringBuilderExample {
    public static void main(String[] args) {

        //mutable
        StringBuilder str=new StringBuilder("Avanthi");

        //object for the
        StringBuilderExample obj=new StringBuilderExample();
        obj.printName(str);
    }

    private void printName(StringBuilder str) {
        System.out.println("Name: " + str);
    }
}
