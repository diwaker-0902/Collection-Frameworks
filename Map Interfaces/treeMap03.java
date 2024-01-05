// Tree Map
// yaha par order ekdum sort ho jaega tree ki according 
import java.util.*;

public class treeMap03 {
    static void TreeMapExamples() {

        TreeMap<Integer, String> mp = new TreeMap<>();

        mp.put(3, "rohan");
        mp.put(1, "pranjal");
        mp.put(2, "nehul");
        mp.put(4, "ashutosh");
        mp.put(5, "abhishek");
        
        System.out.println(mp); 
    
}
public static void main(String[] args) {
    TreeMapExamples();
}
}

// So yaha par keys ke according sorted ho jata hain 