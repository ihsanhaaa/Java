import java.util.*;

import javafx.geometry.Pos;

import java.io.*;

/**
 * heapSort2
 */
public class heapSort2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(30);
        pQueue.add(60);
        pQueue.add(40);

        System.out.println("Head Value " + pQueue.peek());

        System.out.println("--------------------------------------------");
        Iterator itr = pQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}