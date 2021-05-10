/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayBasedQueues;

/**
 *
 * @author Ryan Kolbe
 */
public class ArrayQueueClass {

    private final Customer[] data;
    private int front, rear, count;

    public ArrayQueueClass() {
        data = new Customer[20];
        front = 0;
        rear = 0;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return (rear == front) && count > 0;
    }

    public void enqueue(Customer value) {
        data[rear] = value;
        rear = (rear + 1) % 20;
        count = count + 1;
    }

    public Customer dequeue() {
        Customer value = data[front];
        front = (front + 1) % 20;
        count = count - 1;
        return value;
    }
}