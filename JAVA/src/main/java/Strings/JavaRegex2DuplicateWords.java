package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
* https://stackoverflow.com/questions/2823016/regular-expression-for-duplicate-words
*  https://coding-factory.tistory.com/529
* */
public class JavaRegex2DuplicateWords {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//      대소 문자를 구별하지 않는다.
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0), m.group(1));
            }
            /*
            m.group(0) : Shall contain the matched group in above case Goodbye goodbye GooDbYe
            m.group(1) : Shall contain the first word of the matched pattern in above case Goodbye
            * */

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
