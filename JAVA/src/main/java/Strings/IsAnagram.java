package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class IsAnagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function

        /*eng 26*/
        int[] first = new int[26];
        int[] second = new int[26];

        String aa = a.toLowerCase();
        String bb = b.toLowerCase();


        for (int i = 0; i < aa.length(); i++) {
            char chA = aa.charAt(i);
            /*
            * ascii minus
            * */
            first[chA-'a']++;
        }

        for (int i = 0; i < bb.length(); i++) {
            char chB = bb.charAt(i);
            second[chB-'a']++;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

//    @Test
//    public void charMinus() {
//        int h = 'H';
//        int a = 'a';
//        System.out.printf("%d",  h);
//        System.out.printf("%d",  a);
//    }
}
