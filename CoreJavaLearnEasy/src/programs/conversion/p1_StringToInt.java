package programs.conversion;

import javax.crypto.spec.PSource;

public class p1_StringToInt {
    public static void main(String[] args) {
        {
            //String to int by Integer.parseInt method
            String s = "200";
            int i = Integer.parseInt(s);
            System.out.println(i);

            //String concatenation operator
            System.out.println(s + 100); //200100, because "200"+100, here + is a string concatenation operator
            System.out.println(i + 100); //300, because 200+100, here + is a binary plus operator

            //converting String into Integer using Integer.valueOf() method
            int i1 = Integer.valueOf(s);
            System.out.println(i1+100);

            //If you don't have numbers in string literal, calling Integer.parseInt() or Integer.valueOf() methods throw NumberFormatException
            String s1 = "hello";
            int i2 = Integer.parseInt(s1);
            System.out.println(i2);
        }
    }
}
