// Creating Linked List through Queue
// like linked list bana kar usko queue ki tarah use kar skte hain
// FIFO Based

import java.util.LinkedList;

public class linkedList01 {
    static void QueueExamples() {
        LinkedList<Integer> q = new LinkedList<>();
    q.offer(1);
    q.offer(2);
    q.offer(3);
    System.out.println(q.peek());         // 1
    System.out.println(q.poll());         // 1 ----- will also remove
    System.out.println(q.peek());         // 2  
    System.out.println(q.isEmpty());      // false  ---- kyuki abhi queue empty nahi hain
    System.out.println(q.size());         // 2
    System.out.println(q);

    }
    public static void main(String[] args) {
        QueueExamples();
    }
}    


// Methods in Queue

// offer : inserts the specified element into the queue 
// peek : Retrieves but not remove the head of the queue
// pull : Retrives & removes the head of the queue
// remove : retrieves and removes the head of the queue
// element : retrieves but does not remove the head of this queue