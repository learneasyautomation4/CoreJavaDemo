package day2.NonPrimitiveDataTypes.string;

public class StringBufferExample {
    public static void main(String[] args) {
        //fixed length, immutable
        StringBuffer str=new StringBuffer("Avanthi");

        System.out.println("String value using string buffer:" + str);

        StringBuffer str1=new StringBuffer("Nila");
        System.out.println(str1);

    }
}
