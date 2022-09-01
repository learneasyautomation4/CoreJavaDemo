package day28_Collections.map.hashtable;

import java.util.Hashtable;
import java.util.Map;

/**
 * It is similar to HashMap, but is synchronized.
 * Hashtable stores key/value pair in hash table.
 * In Hashtable we specify an object that is used as a key, and the value we want to associate to that key.
 * The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
 */
public class HashTableDemo {
    public static void main(String args[]) {
        // No need to mention the
        // Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
                = new Hashtable<Integer, String>();
        // Inserting the Elements
        // using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");
        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
        // Iterating using enhanced for loop
        for (Map.Entry<Integer, String> e : ht1.entrySet())
            System.out.println(e.getKey() + ": " + e.getValue());
    }

}