package BigNumber;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BigIntegerTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        BigInteger data = new BigInteger(a);
        BigInteger data2 = new BigInteger(b);
        System.out.println(data.add(data2));
        System.out.println(data.multiply(data2));

        sc.close();
        Map<String, Integer> hashMap = new HashMap<>();
    }

}
