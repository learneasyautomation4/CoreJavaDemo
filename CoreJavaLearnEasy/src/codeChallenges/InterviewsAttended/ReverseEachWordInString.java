package codeChallenges.InterviewsAttended;

/**
 * Reverse each word in the given string
 * <p>
 * Input: Hello World
 * Output: olleH dlroW
 */
public class ReverseEachWordInString {

    public static void main(String[] args) {
        String str = "Hello World love india";
        System.out.println("Original String is: " + str);
        String[] words = str.split(" ");
        String resultString="";
        for (String word : words) {
            String reversedWord = "";
            //reverse word

            for(int i=word.length()-1;i>=0;i--){
                reversedWord=reversedWord+word.charAt(i);
            }
            resultString=resultString+reversedWord+" ";
        }
        System.out.println("Result String is: " + resultString);
    }
}