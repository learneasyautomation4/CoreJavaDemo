package day3.stringmethod;

public class StringMethodsExmaple1 {

    public static void main(String[] args) {
        String str1="Nilavarasi";
        String str2="Ashwin";
        String str3="Nilavarasi";
        String str4="aShWiN";


        //compareTo() -
        System.out.println("String comparision using compareTo method: " + str1.compareTo(str2));

        System.out.println("String comparision using compareTo method: " + str1.compareTo(str3));

        //compareToIgnoreCase()
        System.out.println("String comparision using compareToIgnoreCase method: " + str2.compareToIgnoreCase(str4));

        String str5="Avanthi";
        String str6= "Avanthi";
        String str7="avanthi";

        String str8=new String("avanthi");
        //equals

        System.out.println("Using equals method:" + str5.equals(str6));

        System.out.println("Using equals method:" + str5.equals(str7));

        //equalsignorecase
        System.out.println("String comparision using equals ignore case " + str5.equalsIgnoreCase(str7));
    }
}
