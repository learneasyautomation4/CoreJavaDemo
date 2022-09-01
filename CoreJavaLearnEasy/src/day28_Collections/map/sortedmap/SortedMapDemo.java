package day28_Collections.map.sortedmap;

import java.util.*;

/**
 * SortedMap is an interface in the collection framework.
 * This interface extends the Map interface and provides a total ordering of its elements
 * (elements can be traversed in sorted order of keys).
 * The class that implements this interface is TreeMap.
 *
 */
public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> sm
                = new TreeMap<Integer, String>();
        sm.put(new Integer(2), "practice");
        sm.put(new Integer(3), "quiz");
        sm.put(new Integer(5), "code");
        sm.put(new Integer(4), "contribute");
        sm.put(new Integer(1), "geeksforgeeks");
        Set s = sm.entrySet();

        // Using iterator in SortedMap
        Iterator i = s.iterator();

        // Traversing map. Note that the traversal
        // produced sorted (by keys) output .
        while (i.hasNext()) {
            Map.Entry m = (Map.Entry)i.next();

            int key = (Integer)m.getKey();
            String value = (String)m.getValue();

            System.out.println("Key : " + key
                    + "  value : " + value);
        }

        //changing element
        sm.put(1,"LearnEasy");


        for (Map.Entry mapElement : sm.entrySet()) {
            int key = (int)mapElement.getKey();

            // Finding the value
            String value = (String)mapElement.getValue();

            System.out.println(key + " : " + value);
        }

        //changing element
        sm.remove(1);


        for (Map.Entry mapElement : sm.entrySet()) {
            int key = (int)mapElement.getKey();

            // Finding the value
            String value = (String)mapElement.getValue();

            System.out.println(key + " : " + value);
        }


    }


}