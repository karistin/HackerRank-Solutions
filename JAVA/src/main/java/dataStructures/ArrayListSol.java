package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListSol {

//        5
//        5 41 77 74 22 44
//        1 12
//        4 37 34 36 52
//        0
//        3 20 22 33
//        5
//        1 3
//        3 4
//        3 1
//        4 3
//        5 5
    public static void main(String[] args) {
        try (
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))
        ) {
            List<List<Integer>> integerList = new ArrayList<>();
            int col = Integer.parseInt(buf.readLine());
            // data  input
            while (col > 0) {
                Integer[] array = Stream.of(buf.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
                int row = array[0];
                List<Integer> temp = new ArrayList<>();
                temp.addAll(Arrays.asList(array).subList(1, row + 1));
                integerList.add(temp);
                col --;
            }

            int queryCount = Integer.parseInt(buf.readLine());
            // data query
            while (queryCount > 0) {
                Integer[] array = Stream.of(buf.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(i -> Integer.parseInt(i) - 1)
                    .toArray(Integer[]::new);
                int sum = 0;
                try {
                    sum += integerList.get(array[0]).get(array[1]);
                    System.out.println(sum);
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }
                queryCount --;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
