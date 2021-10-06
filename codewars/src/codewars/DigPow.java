package codewars;

import java.util.Arrays;

public class DigPow {

    public static void main(String[] args) {
        
        int n = 46288;
        int p = 3;
        
        int[] digits = Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(v->Integer.parseInt(v))
                .toArray();
        long summ = 0l;
        for (int i = 0; i < digits.length; i++) {
            summ += (long) Math.pow(digits[i] , p);
            p++;
        }
        
        
        System.out.println(summ%n == 0 ? summ/n : -1);
    }

}
