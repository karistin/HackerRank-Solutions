package exception;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                if (a == 0 || b == 0) {
                    System.out.println("java.lang.ArithmeticException: / by zero");
                }
            }
        } catch (Exception e) {
            System.out.println("java.util.InputMismatchException");
        }

    }
}
