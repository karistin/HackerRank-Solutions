package Strings;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        StringBuffer buf = new StringBuffer(A);
        if (A.equals(buf.reverse().toString())) {
            System.out.println("Yes");
        }

    }

}
