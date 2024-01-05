// Priority Queue 
// PriorityQueue<Integer> pq = new PriorityQueue<>();    isse tohh min ko jyada priority milegi
// PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());      isse max ko jyada priority milegi
import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue02 {
    static void PriorityQueueExamples(){
        // PriorityQueue<Integer> pq = new PriorityQueue<>();    // default is min priority means min no. ko jyda priority dega similarly we can also make max priority queue
       PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  // max priority queue
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());  // 5    // the smallest element has the highest priorityb queue
        System.out.println(pq);
        System.out.println(pq.peek());  // guarantee : topmost priority element will be processed first
        System.out.println(pq);
        System.out.println(pq.poll());  // 5 poll ho jaega means remove 
        System.out.println(pq);
    }
    public static void main(String[] args) {
        PriorityQueueExamples();
    }
}





// Priority Queue not follows the FIFO Based processing
// Priority Queue follows the priority based processing