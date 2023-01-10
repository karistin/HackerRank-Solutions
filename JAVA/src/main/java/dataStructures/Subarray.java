package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        try (
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int a = Integer.parseInt(buf.readLine());
            Integer[] array = new Integer[a];
            array = Stream.of(buf.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
            int count = 0;
            int k = 0;
            while (k < array.length) {
                // 길
                for (int i = 0; i < array.length - k; i++) {
                    int sum = 0;
                    // 범위
                    for (int j = i; j < i + 1 + k; j++) {
                        sum += array[j];
                    }
                    if (sum < 0)
                        count++;
                }
                k++;
            }
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
