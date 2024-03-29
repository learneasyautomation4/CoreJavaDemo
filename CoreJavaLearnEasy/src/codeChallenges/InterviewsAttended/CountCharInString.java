package codeChallenges.InterviewsAttended;

/**
 *  code in Java to display the string which doesn't have consecutive repeated characters.
 *
 * E.g.: Google, Apple, Amazon; It should display "Amazon"
 */
public class CountCharInString {

    public static void main(String args[])
    {
        String arr[]=new String[3];
        arr[0]="Google";
        arr[1]="Apple";
        arr[2]="Amazon";
        for(int i=0;i<arr.length;i++)
        {
            int j;
            for(j=1;j<arr[i].length();j++)
            {
                if(arr[i].charAt(j) == arr[i].charAt(j-1))
                {
                    break;
                }
            }
            if(j==arr[i].length())
                System.out.println(arr[i]);
        }
    }
}