/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayBasedQueues;

import java.time.LocalTime;

/**
 *
 * @author Ryan Kolbe
 */
public class ArrayQueueMain {

    public static void main(String[] args) {

        ArrayQueueClass queue = new ArrayQueueClass();

        queue.enqueue(new Customer("Ryan", LocalTime.parse("12:00")));
        queue.enqueue(new Customer("Dimitri", LocalTime.parse("13:00")));
        queue.enqueue(new Customer("Alex", LocalTime.parse("14:00")));

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}