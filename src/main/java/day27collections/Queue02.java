package day27collections;

import java.util.*;

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
        System.out.println("stdNames = " + stdNames); // [Junaid, Junaid, Boukadida, Hulya, Shukrullah, Saima, Pelin, Ali, Kamel]


        // addLast()
        stdNames.addLast("Hasibullah");
        System.out.println("stdNames = " + stdNames); // [Junaid, Junaid, Boukadida, Hulya, Shukrullah, Saima, Pelin, Ali, Kamel, Hasibullah]

        // remove() and removeFirst()
        // retrieves the first element and removes it
        System.out.println(stdNames.remove()); // Junaid
        System.out.println("stdNames = " + stdNames); // [Junaid, Boukadida, Hulya, Shukrullah, Saima, Pelin, Ali, Kamel, Hasibullah]

        System.out.println(stdNames.removeFirst()); // Junaid
        System.out.println("stdNames = " + stdNames); // [Boukadida, Hulya, Shukrullah, Saima, Pelin, Ali, Kamel, Hasibullah]

        System.out.println(stdNames.removeLast()); // Hasibullah
        System.out.println("stdNames = " + stdNames); // [Boukadida, Hulya, Shukrullah, Saima, Pelin, Ali, Kamel]


        stdNames.addFirst("Ali");
        System.out.println("stdNames = " + stdNames); // [Ali, Boukadida, Hulya, Shukrullah, Saima, Pelin, Ali, Kamel]

        stdNames.removeFirstOccurrence("Ali");
        System.out.println("stdNames = " + stdNames); // [Boukadida, Hulya, Shukrullah, Saima, Pelin, Ali, Kamel]

        stdNames.removeLastOccurrence("Saima");
        System.out.println("stdNames = " + stdNames); // [Boukadida, Hulya, Shukrullah, Pelin, Ali, Kamel]

        // pollFirst() => Retrieves and removes the first element of this deque, or returns null if this deque is empty.
        System.out.println(stdNames.pollFirst()); // Boukadida
        System.out.println("stdNames = " + stdNames); // [Hulya, Shukrullah, Pelin, Ali, Kamel]

        // pollLast() ==> Retrieves and removes the last element of this deque, or returns null if this deque is empty.
        System.out.println(stdNames.pollLast()); // Kamel
        System.out.println("stdNames = " + stdNames); // [Hulya, Shukrullah, Pelin, Ali]


        // push() => Pushes an element at the head of this deque
        stdNames.push("Mariam");
        System.out.println("stdNames = " + stdNames); // [Mariam, Hulya, Shukrullah, Pelin, Ali]

        // offer() => Inserts the specified element at the tail of this deque
        stdNames.offer("John");
        System.out.println("stdNames = " + stdNames); // [Mariam, Hulya, Shukrullah, Pelin, Ali, John]


        // How to get the values out of this Deque one by one?

        for (String w : stdNames){
            System.out.println(w);
        }

//        stdNames.pop();
//        stdNames.poll();
//        stdNames.peek();
//        stdNames.peekFirst();
//        stdNames.peekLast();

        System.out.println("====== ArrayDeque =====");
        /*
        ArrayDeque (implementing deque interface)
            -	This structure allows for fast addition and removal of elements at both the beginning and the end.
            -	ArrayDeque offers higher performance compared to LinkedList because it uses an array-based structure
                for its contents.
            -	ArrayDeque is ideal for fast addition/removal operations at both ends.
            -	ArrayDeque has a dynamic structure

         */

        Deque<String> furnitureTruck = new ArrayDeque<>();
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Chair");
        furnitureTruck.add("Coffee Table");
        furnitureTruck.add("Dinning Table");

        System.out.println("furnitureTruck = " + furnitureTruck); // Insertion order => [Sofa, Bed, Chair, Coffee Table, Dinning Table]


        furnitureTruck.addFirst("TV");
        furnitureTruck.addLast("Chair");
        System.out.println("furnitureTruck = " + furnitureTruck); // [TV, Sofa, Bed, Chair, Coffee Table, Dinning Table, Chair]




    }
}
