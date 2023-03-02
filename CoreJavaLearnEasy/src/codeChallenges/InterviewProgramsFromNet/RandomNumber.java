package codeChallenges.InterviewProgramsFromNet;

import java.util.Random;

/**
 * How do you print ten random numbers using forEach?
 */
public class RandomNumber {
    public static void main(String[] args) {
        RandomNumber obj = new RandomNumber();
        obj.printRandomNumbers();
    }

    public void printRandomNumbers() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

    }
}