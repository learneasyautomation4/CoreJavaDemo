package day3.stringmethod;

public class StringMethodsExmaple {

    public static void main(String[] args) {
        String str="Avanthi";

       //charAt() - returns teh character at specific index
       char ch = str.charAt(0); //'A'

        System.out.println("Character using charAt() " + ch);

        //codePointAt() - returns unicode of the character at the secific incex

       int unicode= str.codePointAt(1);
        System.out.println("Unicode: " + unicode);


        //codePointBefore() - returns unicode of the character before teh specified index
        int unicode1= str.codePointBefore(1);
        System.out.println("Unicode point before: " + unicode1);

        // codePointCount() -

        int unicode2=str.codePointCount(1,4);
        System.out.println("Unicode point count " + unicode2);
    }
}
