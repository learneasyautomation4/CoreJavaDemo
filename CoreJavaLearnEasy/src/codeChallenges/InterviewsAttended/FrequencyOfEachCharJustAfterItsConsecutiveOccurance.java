package codeChallenges.InterviewsAttended;

/**
 * Printing frequency of each character just after its consecutive occurrences
 * Input : GeeeEEKKKss
 * Output : G1e3E2K3s2
 * <p>
 * Input : ccccOddEEE
 * Output : c4O1d2E3
 */
public class FrequencyOfEachCharJustAfterItsConsecutiveOccurance {
    static void printRLE(String s) {
        for (int i = 0; i < s.length(); i++) {
            // Counting occurrences of s[i]
            int count = 1;
            while (i + 1 < s.length()
                    && s.charAt(i)
                    == s.charAt(i + 1)) {
                i++;
                count++;
            }
            System.out.print(s.charAt(i)
                    + "" + count + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        printRLE("GeeeEEKKKss");
        printRLE("ccccOddEEE");
    }
}