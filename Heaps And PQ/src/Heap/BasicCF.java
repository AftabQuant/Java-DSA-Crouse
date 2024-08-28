package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class BasicCF{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Add Elements & Peek Elements
        pq.add(2);
        System.out.println(pq+" Top Element Is"+ pq.peek());
        pq.add(10);
        System.out.println(pq+" Top Element Is"+ pq.peek());
        pq.add(1);
        System.out.println(pq+" Top Element Is"+ pq.peek());
        pq.add(0);
        System.out.println(pq+" Top Element Is"+ pq.peek());
        pq.add(-34);
        System.out.println(pq+" Top Element Is"+ pq.peek());
        // Remove Element
        pq.remove();
        System.out.println(pq+" Top Element Is"+ pq.peek());
        // MaxHeap
        PriorityQueue<Integer> mpq = new PriorityQueue<>(Collections.reverseOrder());
    }

}
