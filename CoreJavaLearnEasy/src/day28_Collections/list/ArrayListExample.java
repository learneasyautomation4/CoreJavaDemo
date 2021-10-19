package JavaConcepts.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
//        List<Integer> list=new ArrayList<Integer>();
//        ArrayList<Integer> list1=new ArrayList<>();
        list.add(20);
        list.add(25);
        list.add(60);
        list.add(70);
        list.add(52);
        list.add(85);
        list.add(63);

        System.out.println(list);

        int sizeList=list.size();
        System.out.println("Size of list is:" + sizeList);

        System.out.println("List item at the 3rd index" + list.get(3));

        System.out.println("List item removed  at the 3rd index" + list.remove(3));

        System.out.println(list);


        int sizeList1=list.size();
        System.out.println("Size of list is:" + sizeList1);


        list.set(2,6000);
        System.out.println("Replace valued 2nd index" + list.get(2));



    List<String> stringList=new ArrayList<String>();
        stringList.add("Sangeetha");
        stringList.add("nila");
        stringList.add("Aswin");
        stringList.add("Kavitha");

        System.out.println("Stringa t 2nd position" + stringList.get(2));

        System.out.println("All list items: " + stringList);






    }


}
