package in.kgcoding.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        Queue<String> que= new LinkedList<>();
        que.add("One");
        que.offer("Two");
        que.offer("Three");
        que.add("Four");
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que.peek());
        System.out.println(que.remove());
        System.out.println(que.element());
        Queue<Integer>pq=new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(3);
        while(!(pq.isEmpty())){
            System.out.println(pq.poll());
        }
    }
}
