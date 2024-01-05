// Deque is a subinterface
// and Deque subinterface ko implement karne wali class ArrayDeque hain
import java.util.*;

public class deque03 {
    static void DequeExamples() {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);                 // 2    1   3   4
        System.out.println(dq.pollFirst());     // 2
        System.out.println(dq);
        System.out.println(dq.pollLast());      // 4
        System.out.println(dq);
    }

    public static void main(String[] args) {
        DequeExamples();        
    }
    
}
