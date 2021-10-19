package JavaConcepts.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Test00","Demo00");
        treeMap.put("Ashwin","password1");
        treeMap.put("Nila","password2");
        treeMap.put("Kavitha","password3");
        System.out.println("Linked Hash map: " +treeMap);

        for (Map.Entry ele : treeMap.entrySet()) {

            System.out.println(ele.getKey());
            System.out.println(ele.getValue());
        }
        System.out.println(treeMap.size());

    }
}
