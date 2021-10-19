package JavaConcepts.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        LinkedList<String> list1=new LinkedList<String>();

        list.add(0,"Kavitha");
        list.add(1,"Sangeetha");
        list.add(2,"Aswin");
        list.add(3,"Nilavarasi");


        list1.addFirst("Mogith");
        list1.add("Sangeetha");
        list1.addLast("Nila");
        list1.add(2,"Aswin");

        System.out.println(list1);

        list1.remove("Aswin");
        list1.remove(1);
        list1.removeFirst();
        list1.removeLast();

        System.out.println(list1);

        System.out.println(list);

        list.remove(0);

        System.out.println(list);
    }
}
