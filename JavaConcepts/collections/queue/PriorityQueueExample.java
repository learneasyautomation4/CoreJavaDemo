package JavaConcepts.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue=new PriorityQueue<Integer>();

        //adding into the priority queue
        pQueue.add(100);
        pQueue.add(200);
        pQueue.add(300);
        pQueue.add(400);
        pQueue.add(500);
        pQueue.add(600);

        System.out.println("Elements of Priority queue:" + pQueue);

        //top element - peek()
        System.out.println("top element of Priority queue :" + pQueue.peek());


        //remvoing the item - poll()
        pQueue.poll();
        System.out.println("Elements of Priority queue:" + pQueue);


        System.out.println("top element of Priority queue :" + pQueue.peek());







    }
}
