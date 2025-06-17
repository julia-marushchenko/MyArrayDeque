// Java Deque with LIFO and FIFO
package com.deque;

import java.util.ArrayDeque;
import java.util.Deque;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating ArrayDeque deque
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements to deque
        deque.add(1);
        deque.add(2);

        // Printing deque to console
        System.out.println(deque);

        // Adding first element
        deque.addFirst(3);

        // Adding last element
        deque.addLast(4);

        // Printing deque to console
        System.out.println(deque);

        // offer() method to insert
        deque.offer(5);
        deque.offerFirst(6);
        deque.offerLast(7);
        deque.offer(8);

        // Printing deque to console
        System.out.println(deque);

        // Printing first element of deque to console
        System.out.println("First element is: " + deque.getFirst());

        // Printing last element of deque to console
        System.out.println("Last element is: " + deque.getLast());

        // Iterating deque
        for (Integer integer : deque) {
            System.out.print(integer + " ");
        }
    }
}