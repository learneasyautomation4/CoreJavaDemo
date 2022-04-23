package programs.misc;

import java.util.ArrayList;
import java.util.Iterator;

public class p8_ArrayListLoops {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("10");
        list.add("20");
        list.add("30");
        System.out.println(list.size());
        System.out.println("WHILE LOOP");
        Iterator itr = list.iterator();

        //iterate through while loop
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //iterate through advanced for loop
        System.out.println("ADVANCED FOR LOOP");
        for (Object list1 : list) {
            System.out.println(list1);
        }

        //iterate through for loop
        System.out.println("FOR LOOP");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
