package Strings;

import java.util.Arrays;
import java.util.Scanner;

/*
* Input
hello
java
* Output
9
No
Hello Java
* */
public class JavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        /*
        * String
        * 1. 비교 대상의 문자열의 길이의 차이값을 리턴
        * 2. 문자열의 첫번쨰 값이 다른 경우 아스키 코드값의 차이를 리턴
        * */
        if (A.compareTo(B) > 1){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));
        sc.close();

    }

}
