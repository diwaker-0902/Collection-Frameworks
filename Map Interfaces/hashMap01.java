// Map Interface main key-value pair ki mapping hoti hain
import java.util.*;

public class hashMap01 {
    static void HashMapExamples() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(3, "rohan");
        hm.put(1, "pranjal");
        hm.put(2, "nehul");
        hm.put(4, "ashutosh");
        hm.put(5, "abhishek");

        System.out.println(hm.containsKey(2));                      // this is key
        System.out.println(hm.get(1));
        System.out.println(hm);
        System.out.println(hm.containsValue("nehul"));            // this is value
        System.out.println();
        
        hm.put(1, "teena");                                 // teena replaced pranjal means overwrite kar diya teena ne
        hm.putIfAbsent(4, "naina");             // isse overwrite nahi ho paega
        System.out.println(hm.entrySet());              // returns the Set view of the mapping contained in this map
        System.out.println();
        System.out.println(hm);
        System.out.println(hm.keySet());       // it provides only keys
        System.out.println(hm.values());       // returns only values 
                
        // iterate over keys
        for(Integer i : hm.keySet()){       // for each integer in hm.keySet()
        System.out.println(i);
        }

        // iterate over values
        for(String i : hm.values()){              // also can write var instead of integer and string ye khud hi identify kar lega 
            System.out.println(i);
        }
System.out.println();

        // iterate over the key or value mapping
        for(var e : hm.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        } 
    }
    public static void main(String[] args) {
        HashMapExamples();
    }
    }



// Map Interface : HashMap(class), LinkedHashMap(class), SortedMap(sub-interface)-> TreeMap(class)