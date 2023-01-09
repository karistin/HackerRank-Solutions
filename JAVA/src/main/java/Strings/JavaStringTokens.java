package Strings;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        /*
        * [] include
        *  whitespace, ! ? . ' @
        * + 하나 이상
        * */
        List<String> regex = List.of(s.trim().split("[ !,?._'@]+"));
        System.out.println(regex.size());
        regex.forEach(System.out::println);
        scan.close();
    }

    @Test
    public void strParsing() {
        String a = " 123 123 123 123 ";
        System.out.println("trim :" + a.trim());
        // 좌우 공백 제거
        // '\u0020' 이하의 공백들만 제거합니다.

        System.out.println("strip :" + a.strip());
        // 유니코드의 공백들을 모두 제거합니다.
        // 스페이스('\u0020'), 탭('\u0009)

        System.out.println("replace :" + a.replace(" ", ""));
        // 모든 공백 제거

        System.out.println("regex :" + a.replaceAll("\\s", ""));
    }

    @Test
    public void splitParsing() {
        String str = "Hello World";
        List<String> arrayStr = List.of(str.split(" "));
        arrayStr.forEach(System.out::println);
    }
}
