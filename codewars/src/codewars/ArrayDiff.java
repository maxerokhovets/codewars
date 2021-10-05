package codewars;

import java.util.ArrayList;
import java.util.List;

public class ArrayDiff {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3, 5};
        int b[] = {3, 5};
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int counter = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[j]) {
                    counter++;
                }   
            }
            if (counter==0) list.add(a[i]);
        }
        list.stream().mapToInt(p->p).toArray();
               
       
    }
}
