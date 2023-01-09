package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
/*
* https://codechacha.com/ko/java-regex/
* IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
* */

public class JavaRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    /*
    * \d{1,2} : 0 ~ 99
    * (0|1)\d{2} : 000 ~ 199
    * 2[0-4]\d : 200 ~ 249
    * 25[0-5] : 250 ~ 255
    * */
    static String ip = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public static String pattern = ip + "\\." + ip + "\\." + ip + "\\." + ip;
}
