package BigNumber;

import static org.hamcrest.MatcherAssert.assertThat;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.junit.jupiter.api.Test;


public class JavaBigDecimal {

    // Java의 BigDecimal 클래스는 임의 정밀도의 부호 있는 10진수를 처리할 수 있습니다.
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, Collections.reverseOrder(((o1, o2) -> {
            if (o1 == null || o2 == null) return 0;
            BigDecimal b1 = new BigDecimal(o1);
            BigDecimal b2 = new BigDecimal(o2);
            return b1.compareTo(b2);
        })));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

///*
// * https://velog.io/@new_wisdom/Java-BigDecimal%EA%B3%BC-%ED%95%A8%EA%BB%98%ED%95%98%EB%8A%94-%EC%95%84%EB%A7%88%EC%B0%8C%EC%9D%98-%EB%84%88%EB%93%9C%EC%A7%93
// * */
    @Test
    public void bigDecimalTest() {
        double a = 100.000;
        double b = 10.00000000001;
        System.out.println(a-b);
    }
}

