package JavaConcepts.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> tSet=new TreeSet<Integer>();
        tSet.add(50);
        tSet.add(15);
        tSet.add(9);
        tSet.add(100);
        tSet.add(0);
        System.out.println("Tree Set: " +tSet);
    }
}
