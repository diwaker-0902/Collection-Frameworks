// LinkedHashSet

import java.util.LinkedHashSet;

public class linkedHashset02 {
    static void LinkedHashSet() {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(2);
        hs.add(3);
        hs.add(1);
        hs.add(7);
        System.out.println(hs);



        
    }
    public static void main(String[] args) {
        LinkedHashSet();
    }
}


// Linked HashSEt mai bas ek cheez ki gurantee hoti hain ki element jis order mai enter hue hai wo usi order mai print bhi honge 
// here we are using the order of preservation