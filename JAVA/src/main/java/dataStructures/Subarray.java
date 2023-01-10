package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        try (
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))
        ) {
            int a = Integer.parseInt(buf.readLine());
//            Integer[] array = new Integer[a];
            Integer[] array = Stream.of(buf.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
            int count = 0;
            int k = 0;
            /*
            * K 갯수 (1, 2, 3, ..)
            * i 시작점
            * j 끝나는점 = i + k
            * */
            while (k < array.length) {
                for (int i = 0; i + k < array.length; i ++ ) {
                    if (intervalSum(array, i, i + k) < 0) {
                        count ++;
                    }
                }
                k++;
            }
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    * a 시작값
    * b 종료값
    * array 배열
    * */
    private static int intervalSum(Integer[] array, int a, int b) {
        int sum = 0;
        if ( (a+b) <= array.length * 2  && a <= b) {
            while (a <= b) {
                sum += array[a];
                a++;
            }
        }
        return sum;
    }

    @Test
    public void intervalSumTest() {
        Integer[] arr = {1, 2, 3, 4};
        Assertions.assertEquals(intervalSum(arr, 0, 3), 10);
    }
}
