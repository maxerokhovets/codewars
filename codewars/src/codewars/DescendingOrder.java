package codewars;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        String numString = Integer.toString(num);
         List<Integer> numDigits =  Arrays.stream(numString.split(""))
            .map(p->Integer.parseInt(p))
            .sorted()
            .collect(Collectors.toList());
         int exp = numDigits.size()-1;
         int rearrangeNum = numDigits.get(0);
         for (int i = numDigits.size()-1; i>0; i--) {
            rearrangeNum += numDigits.get(i)*(int)Math.pow(10, exp);
            exp--;
        }
        
        System.out.println(rearrangeNum);
    }

}
