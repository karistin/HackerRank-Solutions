package dataStructures;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoDArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int sum = -64;
        int data = 0;
        /*
        * 0     1   2
        *       1.2
        * 2.0   2.1 2.2
        * */

        for (int i = 0; i < arr.size() - 2 ; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                data = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) +
                    arr.get(i + 1).get(j + 1)
                    + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                sum = Math.max(sum, data);
//                System.out.println(sum + ": ("+ (i+1) +", "+ (j+1) +")");
            }
        }

        System.out.println(sum);
        bufferedReader.close();
    }


}
