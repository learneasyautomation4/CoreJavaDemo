package programs.misc;

public class p14_DuplicateChar {
    public static void main(String[] args) {
        String str = "SSAAnnggeettaa";
        char[] chars = str.toCharArray();
        System.out.println("Duplicate characters are:");

        for (int i=0; i<str.length();i++) {
            for(int j=i+1; j<str.length();j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(chars[j]);
                    break;
                }
            }
        }
    }
}
