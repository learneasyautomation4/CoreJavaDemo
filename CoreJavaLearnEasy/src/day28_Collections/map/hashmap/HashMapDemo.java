package day28_Collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

//working of Map Interface

/**
 * HashMap<K, V> is a part of Java’s collection since Java 1.2.
 * This class is found in java.util package.
 * It provides the basic implementation of the Map interface of Java.
 * It stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer). One object is used as a key (index) to another object (value).
 * If we try to insert the duplicate key, it will replace the element of the corresponding key.
 */
public class HashMapDemo {
    public static void main(String[] args) {

        // Creating an empty HashMap
        Map<String,Integer> hm=new HashMap<String,Integer>();

        //Insert pairs of key-value in the map using put() method
        hm.put("Employee1" ,1001);
        hm.put("Employee2",1002);
        hm.put("Employee3",1003);

                //Traversing through Map using for-each loop
        for(Map.Entry<String,Integer> mapEntrySet: hm.entrySet()){
            System.out.println(mapEntrySet.getKey() + " : " + mapEntrySet.getValue());
        }

        /*
        entrySet() : This method is used to create a set out of the same elements contained in the map.
         It basically returns a set view of the map or we can create a new set and store the map elements into them.
         */

        //changing elements - value of the key can be changed using put()Method
        hm.put("Employee2",1005);

        System.out.println("Updated Map is: ");

        //Traversing through Map using for-each loop
        /**
         * We can use the Iterator interface to traverse over any structure of the Collection Framework.
         * Since Iterators work with one type of data we use Entry< ? , ? > to resolve the two separate types into a compatible format.
         * Then using the next() method we print the entries of HashMap.
         */
        for(Map.Entry<String,Integer> mapEntrySet: hm.entrySet()){

            System.out.println(mapEntrySet.getKey() + " : " + mapEntrySet.getValue());
        }

        //Removing an element
        hm.remove("Employee2");

        System.out.println("After removing an element in the Map: ");

        //Traversing through Map using for-each loop
        for(Map.Entry<String,Integer> mapEntrySet: hm.entrySet()){

            System.out.println(mapEntrySet.getKey() + " : " + mapEntrySet.getValue());
        }

    }
}