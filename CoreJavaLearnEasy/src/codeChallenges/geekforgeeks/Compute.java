package codeChallenges.geekforgeeks;

public class Compute {
    public static void main(String[] args) {
        Compute obj=new Compute();
        String averageOfNumbersStr=obj.average(new int[]{40,50,60,42,52,85,70},7);
        Float f1=Float.parseFloat(averageOfNumbersStr); //convert String to float
        System.out.println(f1);
    }

    String average(int A[], int N)    {
        float averageOfNumbers;
        float sum = 0;
        for(int i=1;i<A.length;i++){
            sum=0;
            sum=sum+A[i];
        }
        averageOfNumbers=sum/N;
        String avgNumbers = Float.toString(averageOfNumbers); //convert float into String
        return avgNumbers;
    }
}