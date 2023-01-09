package Strings;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String cut = s.substring(0, k);
        smallest = largest = cut;

        for (int i=1; i<= (s.length() - k); i++)
        {

            cut = s.substring(i,(i+k));
            if (cut.compareTo(smallest)<0)
            {
                smallest = cut;
            }
            if (cut.compareTo(largest)>0)
            {
                largest = cut;
            }
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
