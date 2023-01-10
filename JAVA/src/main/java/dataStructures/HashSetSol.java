package dataStructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashSetSol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
//Write your code here
        Set<Map<String, String>> hashSet = new HashSet<>();
        for (int i = 0; i < t; i++) {
            Map<String, String> data = new HashMap<>();
            data.put(pair_left[i], pair_right[i]);
            hashSet.add(data);
            System.out.println(hashSet.size());
        }
        s.close();
    }

}
