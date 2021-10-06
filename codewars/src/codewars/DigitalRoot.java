package codewars;

import java.util.Arrays;

public class DigitalRoot {

    public static void main(String[] args) {
        
        int n = 493193;
        while (n>9) {
            n = Arrays.stream(String.valueOf(n).split(""))
                    .mapToInt(p->Integer.parseInt(p))
                    .reduce((p,v)->p+v)
                    .getAsInt();
        }
        
        System.out.println(n);
    }

}
