package Advanced;

import static org.junit.jupiter.api.Assertions.assertTrue;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Permission;
import org.junit.jupiter.api.Test;

public class AccessSol {
    public static void main(String[] args) throws Exception {
        DoNotTerminate.forbidExit();
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
            //Write your code here
            Inner obj = new Inner();
            Inner.Private pri = obj.new Private();
            System.out.println(num+" is "+pri.powerof2(num));
            o= obj.new Private();
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        }//end of try

        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }//end of Inner

    @Test
    public void byteCal() {
        /*
        * 덧셈, 뺼셈 후 비트 연산자.
        * */
//        1000  & 0111
//        2의 거듭제곱은 딱 남아서 떨어진다. 1000, 100 , 10 , 1
//         그리하여 -1 후 and 시 0으로 떨어지면 이는 2의 거듭제곱 수임을 알 수 있다.( 2^31-1 ~ -2^31 내에서)
        assertTrue((8 & 7) == 0);

        System.out.println(((1024&1024-1)==0)?"power of 2":"not a power of 2");
    }
}
class DoNotTerminate { //This class prevents exit(0)

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}