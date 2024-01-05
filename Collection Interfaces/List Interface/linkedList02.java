import java.util.*;

public class linkedList02 {
    static void LinkedListExamples() {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(1, 10);
        System.out.println(l);
        System.out.println(l.contains(10));
    }

        public static void main(String[] args) {
            LinkedListExamples();
        }
    }
