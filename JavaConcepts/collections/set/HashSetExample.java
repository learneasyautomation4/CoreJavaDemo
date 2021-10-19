package JavaConcepts.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hSet=new HashSet<String>();
        hSet.add("Sangeeta");
        hSet.add("Nila");
        hSet.add("Ashwin");
        hSet.add("Kavitha");
        System.out.println("Hash Set: " +hSet);

        hSet.add("Sangeeta");
        hSet.add("Priya");
        System.out.println("Hash Set: " +hSet);

        hSet.remove("Sangeeta");
        System.out.println("Hash Set: " +hSet);

        Iterator<String> itr=hSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
