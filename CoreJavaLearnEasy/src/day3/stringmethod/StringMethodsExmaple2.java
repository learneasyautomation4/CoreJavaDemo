package day3.stringmethod;

public class StringMethodsExmaple2 {

    public static void main(String[] args) {
        String str1 = "Nilavarasi";
        String str2 = "Ashwin";
        String str3 = "Nilavarasi";
        String str4 = "aShWiN";
        String str5="Kumar";

        //concat() - appends the string at the end
        System.out.println("Concatenation: " + str2.concat(str5));

        //contains()
        System.out.println("Contains method: " + str1.contains("Nila"));

        //contentEquals()
        System.out.println("content Equails: " + str1.contentEquals("Nilavarasi")); //true

        System.out.println("content Equails: " + str1.contentEquals("ila")); //false

        //copyValueOf()

        char[] ch={'A','V','A','N','T','H','I'};

        String str6="";
        str6=str6.copyValueOf(ch,0,6);

        System.out.println("Copy value of: " + str6);

        String str7="";
        str7=str7.copyValueOf(ch,4,2);

        System.out.println("string: " + str7);

       //endsWith()
        System.out.println("End ");
    }
}
