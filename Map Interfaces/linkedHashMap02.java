// Linked HashMap
// isme order of insertion preserve ho jaega ----- means jo bhi order diy hain ussi order main aaega
import java.util.*;

public class linkedHashMap02 {
    static void LinkedHashMapExamples() {

        LinkedHashMap<Integer, String> mp = new LinkedHashMap<>();

        mp.put(3, "rohan");
        mp.put(1, "pranjal");
        mp.put(2, "nehul");
        mp.put(4, "ashutosh");
        mp.put(5, "abhishek");
        
        System.out.println(mp);

        // System.out.println(mp.containsKey(2));                      // this is key
        // System.out.println(mp.get(1));
        // System.out.println(mp);
        // System.out.println(mp.containsValue("nehul"));            // this is value
        // System.out.println();
        
    }
public static void main(String[] args) {
    LinkedHashMapExamples();
}    
}
