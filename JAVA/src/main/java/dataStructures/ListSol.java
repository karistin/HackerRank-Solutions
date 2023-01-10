package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(sc.nextInt());
        }

        int query = sc.nextInt();
        while (query-- > 0) {
            String word = sc.next();
            if (word.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y);
            } else if (word.equals("Delete")) {
                int x = sc.nextInt();
                list.remove(x);
            }
        }

        for (Integer data : list) {
            System.out.printf("%d ", data);
        }
        sc.close();
    }

}
