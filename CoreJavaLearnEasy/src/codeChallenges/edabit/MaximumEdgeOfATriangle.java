package codeChallenges.edabit;

import java.util.Scanner;

/**
 * ============================
 * Maximum Edge of a Triangle
 * https://edabit.com/challenge/zBhuXyFeSQdizC5LW
 * ============================
 * <p>
 * Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
 * <p>
 * Examples
 * nextEdge(8, 10) ➞ 17
 * <p>
 * nextEdge(5, 7) ➞ 11
 * <p>
 * nextEdge(9, 2) ➞ 10
 * Notes
 * (side1 + side2) - 1 = maximum range of third edge.
 * The side lengths of the triangle are positive integers.
 * Don't forget to return the result.
 */
public class MaximumEdgeOfATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1 and side2: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int nextSide= nextEdge(side1,side2);
        System.out.println(nextSide);
    }
    private static int nextEdge(int side1, int side2) {
        int nextSideOfTriangle = 0;
        if (side1 > 0 && side2 > 0) {
            nextSideOfTriangle = (side1 + side2) - 1;
        }
        return nextSideOfTriangle;

    }
}