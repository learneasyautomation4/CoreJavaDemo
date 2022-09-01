package day28_Collections.map.linkedHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A LinkedHashMap contains values based on the key. It implements the Map interface and extends the HashMap class.
 * It contains only unique elements.
 * It may have one null key and multiple null values.
 * It is non-synchronized.
 * It is the same as HashMap with an additional feature that it maintains insertion order.
 * For example, when we run the code with a HashMap, we get a different order of elements.
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, String> lHashMap = new LinkedHashMap<>();
        lHashMap.put("username","password");
        lHashMap.put("sangeeta","password1");
        lHashMap.put("username2","password2");
        lHashMap.put("username3","password3");
        System.out.println("Linked Hash map: " +lHashMap);

        lHashMap.put("username", "Nila123");
        System.out.println("Linked Hash map: " +lHashMap);

        lHashMap.remove("sangeeta");
        System.out.println("Linked Hash map: " +lHashMap);

        // For-each loop for traversal over Map

        for (Map.Entry ele : lHashMap.entrySet()) {

            System.out.println(ele.getKey());
            System.out.println(ele.getValue());
        }

        System.out.println("Contains key? " +lHashMap.containsKey("username"));
        System.out.println("Contains value? " + lHashMap.containsValue("password1"));

        for (Map.Entry<String, String> mapElement :
                lHashMap.entrySet()) {

            String key = mapElement.getKey();

            // Finding the value
            // using getValue() method
            String value = mapElement.getValue();

            // Printing the key-value pairs
            System.out.println(key + " : " + value);
        }
    }

}