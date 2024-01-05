// ArrayList is similar to array, but it is dynamic (resizable size)

import java.util.*;
public class arrayList01 {

        static void ArrayListExamples() {                   //ArrayListExamples name ka ye ek method hain
            ArrayList<Integer> l = new ArrayList<>();       // integer ki arrayList bana rahe hain called as l
            l.add(1);                                     // adding elements in list 
            l.add(2);
            l.add(3);
            System.out.println(l);                          // 1,2,3
            System.out.println(l.get(1));             // to retrieve element and it is the 1-based indexing
            l.set(1, 10);                     // modify at index i
            System.out.println(l);
            System.out.println(l.contains(10));           // True (if 10 hain tohh True return karega)

        }
        public static void main(String[] args){
            ArrayListExamples();

        }
    }




// interfce is blueprnt of a class, isme sirf methods ki declaration hoti hain and inme body nahi hoti
// and ye jo methods hote hain na jinki body nahi hoti hain unko ab Abstract Method bolte hain

// Abstract Method : Abstract Methods ki only declaration hoti hain and inki body nahi hoti hain and also inki implementation
// bhi provide ni ki gayi hoti hain