package codewars;

import java.util.Scanner;

public class TriangleTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        boolean isTriangle = false;
        if (a+b>c & a+c>b & b+c>a) {
            isTriangle = true;
        }
        System.out.println(isTriangle);
    }

}
