package programs.misc;

public class p11_RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str1 = "This a     Java Program";
        str1 = str1.replaceAll("\\s", "");
        System.out.println(str1);
    }
}
