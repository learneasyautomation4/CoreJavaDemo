package JavaConcepts.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<String> lHashSet=new LinkedHashSet<>();
        lHashSet.add("Sangeeta");
        lHashSet.add("Nila");
        lHashSet.add("Ashwin");
        lHashSet.add("Kavitha");
        System.out.println("Linked Hash Set: " +lHashSet);

        lHashSet.remove("Sangeeta");
        System.out.println("Linked Hash Set: " +lHashSet);

        Iterator<String> itr=lHashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
