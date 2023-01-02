package introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
* https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html
* https://stackoverflow.com/questions/5379231/displaying-currency-in-indian-numbering-format
* Locale language tag를 사용하는 국가 설정하기
* */

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }

}
