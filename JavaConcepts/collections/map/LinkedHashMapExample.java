package JavaConcepts.collections.map;
import java.util.LinkedHashMap;
import java.util.Map;

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

        for (Map.Entry ele : lHashMap.entrySet()) {

            System.out.println(ele.getKey());
            System.out.println(ele.getValue());
        }

    }
}
