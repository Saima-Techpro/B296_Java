package day27collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue02 {
    public static void main(String[] args) {

        /*
        PriorityQueue is a queue tool that sorts objects according to their priority order in a FIFO (first in first out)
        structure.
        That is, the object with the highest priority is always handled first.

        -	A real-life example could be the order of patients entering the emergency room at a hospital
            represented as a priorityQueue.

            Patients are sorted according to their urgency levels.
            The patient with the highest urgency is always treated first.

         */

        // Queue<String> emergencyQueue = new PriorityQueue<>();

        PriorityQueue<String> emergencyQueue = new PriorityQueue<>();
        emergencyQueue.add("Boukadida");
        emergencyQueue.add("Hulya");
        emergencyQueue.add("Shukrullah");
        emergencyQueue.add("Saima");
        emergencyQueue.add("Pelin");
        emergencyQueue.add("Ali");
        emergencyQueue.add("Kamel");

        // PriorityQueue adds values randomly
        System.out.println("emergencyQueue = " + emergencyQueue); // [Ali, Hulya, Boukadida, Saima, Pelin, Shukrullah, Kamel]

        System.out.println(emergencyQueue.remove()); // Ali
        System.out.println("emergencyQueue = " + emergencyQueue); // [Boukadida, Hulya, Kamel, Saima, Pelin, Shukrullah]

        /*
         Deque (Double-Ended Queue) is a data structure that allows adding and removing elements from both ends.
        Deque can be sorted as FIFO (first in first out) or LIFO (last in first out).

        Real Life example: Browser history and ability to move back and forth between the browsers
         */

        Deque<String> stdNames = new LinkedList<>();

        stdNames.add("Boukadida");
        stdNames.add("Hulya");
        stdNames.add("Shukrullah");
        stdNames.add("Saima");
        stdNames.add("Pelin");
        stdNames.add("Ali");
        stdNames.add("Kamel");
        System.out.println("stdNames = " + stdNames);

        // addFirst()
        stdNames.addFirst("Junaid");
        stdNames.addFirst("Junaid");
        System.out.println("stdNames = " + stdNames);



    }
}
