// HashSet : it is unordered & it is the unordered collection of unique sets & all the values are unique 
// Set : A set is a collection that contains no duplicate elements means uniueness
import java.util.*;
public class hashSet01 {
    static void HashSetExamples() { 
    HashSet<Integer> st = new HashSet<>();
    st.add(1);
    st.add(2);
    st.add(3);
    System.out.println(st);
    st.add(1);                  // ye dono hi again print nahi honge becoz set is a collection of unique numbers
    st.add(2);                  // ye dono hi again print nahi honge becoz set is a collection of unique numbers
    System.out.println(st);
    st.remove(2);
    System.out.println(st);
    st.remove(3);
    System.out.println(st);
    System.out.println(st.contains(2));
    st.add(4);
    System.out.println(st);
    System.out.println(st.size());
  }
    public static void main(String[] args) {
        HashSetExamples();
        
    }
}


// HashSet is unordered means elemens kisi bhi order main ho sakte hain
// HashSet uses hashing internally, becoz hashing every element ke liye ek unique key generate karta hain