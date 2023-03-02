package codeChallenges.InterviewProgramsFromNet;

/**
 * Java Program to count the total number of characters in a string
 */
public class CountTotalNumberOfCharInString {

    public static void main(String[] args) {
        CountTotalNumberOfCharInString obj=new CountTotalNumberOfCharInString();
        String s="Kavitha is my best friend";
        obj.countCharInString(s);
    }
    private void countCharInString(String s) {
        char[] charArr=s.toCharArray();
        int count=0;
        for(int i=0;i<charArr.length;i++){
            if(charArr[i]!=' '){
                count++;
            }
        }
        System.out.println("Total number of character in the given String: "+ s +" - " + count);
    }
}