package dataStructures;

import java.util.Scanner;
import java.util.Stack;
import org.junit.jupiter.api.Test;

public class StackSol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            Stack<Character> stack = new Stack<>();
            String input=sc.next();
            //Complete the code
            for (int i = 0; i < input.length(); i++) {
                if (stack.isEmpty()) {
                    stack.push(input.charAt(i));
                } else if (isbracket(stack.peek(), input.charAt(i))) {
                    stack.pop();
                } else {
                    stack.push(input.charAt(i));
                }
            }
            if (stack.size() == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    private static boolean isbracket(char a, char b) {
        String c = a + "" + b;
        return c.equals("()") || c.equals("{}") || c.equals("[]");
    }

    @Test
    public void testCode() {
        char a = '(';
        char b = ')';
        String c = a + "" + b;
        System.out.println(c);
    }

}
