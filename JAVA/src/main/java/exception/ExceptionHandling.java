package exception;


import java.util.Scanner;

class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */

    public long power(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            Exception e = new Exception("n or p should not be negative.");
            throw e;
        }
        else if (a == 0 && b == 0) {
            Exception e = new Exception("n and p should not be zero.");
            throw e;
        }

        return (long) Math.pow(a, b);

    }

}

public class ExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
