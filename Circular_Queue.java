
import java.util.*;

public class Circular_Queue {
    // Maximum size of the circular queue
    public int max = 5;
    
    // Array to store queue elements
    int arr[] = new int[max];
    
    // Front (F) and Rear (R) pointers
    int F = -1;
    int R = -1;

    // Function to insert an element (enqueue)
    public void enqueue(int data) {
        // Check if the queue is full
        if ((F == (R + 1) % max)) {
            System.out.println("Queue is FULL. Cannot insert " + data);
            return;
        }

        // If inserting the first element
        if (F == -1 && R == -1) {
            F = 0;
            R = 0;
            arr[R] = data;
        } 
        else {
            // Move rear pointer in circular manner
            R = (R + 1) % max;
            arr[R] = data;
        }

        System.out.println("Enqueued : " + data);
    }

    // Function to delete an element (dequeue)
    public void dequeue() {
        // Check if the queue is empty
        if (F == -1 && R == -1) {
            System.out.println("Queue is EMPTY. Nothing to dequeue.");
            return;
        }

        // Store the element to be dequeued
        int ddata = arr[F];
        
        // If only one element was in the queue
        if (F == R) {
            F = -1;
            R = -1;
        } 
        else {
            // Move front pointer in circular manner
            F = (F + 1) % max;
        }

        System.out.println("Dequeued : " + ddata);
    }

    // Function to display the queue
    public void display() {
        if (F == -1 && R == -1) {
            System.out.println("Queue is EMPTY.");
            return;
        }

        System.out.print("Queue Elements: ");
        int i = F;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == R) break;  // stop when rear is reached
            i = (i + 1) % max;
        }
        System.out.println();
    }

    // Main function to test circular queue
    public static void main(String[] args) {
        Circular_Queue q = new Circular_Queue();

        // Inserting elements
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        // Trying to insert into full queue
        q.enqueue(60);

        // Deleting elements
        q.dequeue();
        q.dequeue();

        q.display();

        // Inserting after deletion (to test circular behavior)
        q.enqueue(60);
        q.enqueue(70);

        q.display();
    }
}

