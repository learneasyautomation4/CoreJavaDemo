package JavaConcepts.collections.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayDequeExample {

    public static void main(String[] args) {
        Deque<String>  deque=new LinkedList<>();

        deque.add("Sangeetha");
        deque.add("Shanthi");
        deque.add("Kavitha");

        //adding at first
        deque.addFirst("Sarathi");

        //adding at the last
        deque.addLast("Sara");


        //adding at first
        deque.push("Ashwin");

        //adding at the last
        deque.offer("Babu");

        System.out.println("Elements of deque:" + deque);


        deque.remove("Kavitha");

        System.out.println("Elements of deque:" + deque);

        deque.removeFirst();
          deque.removeLast();
        System.out.println("Elements of deque:" + deque);
//            for(int i=0;i<10;i++){
//                System.out.println(i);
//            }

        for (Iterator itr = deque.iterator(); itr.hasNext(); ) {

            System.out.println("Element of deque: " + itr.next());

        }
    }
}
