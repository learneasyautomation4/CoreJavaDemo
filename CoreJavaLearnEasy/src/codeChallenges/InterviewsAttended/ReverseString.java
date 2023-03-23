package codeChallenges.InterviewsAttended;

/**
 * Replace a string
 * Input: Hello
 * Output: 0lleH
 *
 * Approach 1: toCharArray()
 * Approach 2: charAt()
 * Approach 3: StringBuffer
 * Approach 4: StringBuilder
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String is: " + str);
        //approach -1
        char[] charArr = str.toCharArray();
        System.out.print("Reversed String is: ");
        for (int i = charArr.length - 1; i >= 0; i--) {
            System.out.print(charArr[i]);
        }
        System.out.println();

        //Approach 2
        System.out.print("Reversed String is: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        //Approach 3
        System.out.print("Reversed String is: ");
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.print(stringBuffer.reverse());
        System.out.println();

        //Approach 4
        System.out.print("Reversed String is: ");
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
        System.out.println();

    }
}