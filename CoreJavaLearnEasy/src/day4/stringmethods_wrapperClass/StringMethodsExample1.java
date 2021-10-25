package day4.stringmethods_wrapperClass;

public class StringMethodsExample1 {
    public static void main(String[] args) {

        String str1="avanthi";
        String str2= "NiLaVaraSi";

        //toUpperCase() case method
        System.out.println("Upper case: " + str1.toUpperCase());

        //toLowerCase()
        System.out.println("Lower case: " + str2.toLowerCase());

        String str3="Welcome to learneasy automation";

        //replace()
        System.out.println("Replace of string: " + str3.replace("t","for"));

        //replaceAll()
        String str4="you scream I scream we all scream icecream";

        System.out.println("replace All: " + str4.replaceAll("scream","cake"));

        System.out.println("replace: " + str4.replace("scream","cake"));

        //replaceFirst()
        System.out.println("replace First: " + str4.replaceFirst("scream","cake"));



    }
}
