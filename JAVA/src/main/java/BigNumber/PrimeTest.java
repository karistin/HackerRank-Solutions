package BigNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

public class PrimeTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        // Int를 String으로 저장하여 높은 수를 저장하는 방식
        BigInteger num = new BigInteger(n);
        System.out.println(num.isProbablePrime(100) ? "prime" : "not prime");

        bufferedReader.close();
    }

//    over java 8
    @Test
    public static List<Integer> primeNumbersTill(int n) {
        return IntStream.rangeClosed(2, n)
            .filter(x -> isPrime(x)).boxed()
            .collect(Collectors.toList());
    }

//    Math.sqrt() 로 제곱근으로 떨어지는지를 테스트
    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) (Math.sqrt(number)))
            .allMatch(n -> number % n != 0);
    }
}
