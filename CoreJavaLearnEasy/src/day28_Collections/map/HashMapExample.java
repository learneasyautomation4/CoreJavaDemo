package JavaConcepts.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> hMap = new HashMap<String, String>();
        hMap.put("username","password");
        hMap.put("sangeeta","password1");
        hMap.put("username2","password2");
        hMap.put("username3","password3");
        System.out.println("Hash map: " +hMap);

        hMap.put("username", "Nila123");
        System.out.println("Hash map: " +hMap);

        hMap.remove("sangeeta");
        System.out.println("Hash map: " +hMap);

        for (Map.Entry ele : hMap.entrySet()) {

            System.out.println(ele.getKey());
            System.out.println(ele.getValue());
        }



    }
}