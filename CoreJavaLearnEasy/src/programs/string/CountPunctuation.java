package programs.string;

public class CountPunctuation {
    public static void main(String[] args) {
        String s = "He said, 'The mailman loves you.' I heard it with my own ears.";
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='!' || s.charAt(i)==',' || s.charAt(i)=='.' || s.charAt(i)=='?' || s.charAt(i)==':'){
                count++;
            }
        }
        System.out.println("Number of punctuations are: " +count);
    }
}
