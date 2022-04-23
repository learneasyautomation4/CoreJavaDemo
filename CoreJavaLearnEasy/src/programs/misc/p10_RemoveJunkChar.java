package programs.misc;

public class p10_RemoveJunkChar {
    public static void main(String[] args) {
        String str = "#%&^79098khkjhkowmd_()(0?,.'";
        String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);
    }
}
