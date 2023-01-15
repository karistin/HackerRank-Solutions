package dataStructures;

import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class OneDArrayGame {
    /*
    * i 는 현제 위치
    * 1. i - 1이 존재하고 0인 경우 i - 1로 후퇴
    * 2. i + 1이 존재하고 0인 경우 i + 1로 전진
    * 3. i + leap에 0이 존재하면 점프
    * 4. 배열의 끝이 아니거나 i + leap가 배열 길이보다 크거나 같은 경우 점프 가능
    * 정리
    * i-1 i+1 i+leap에 0이 존재하고 갈 수 있다.
    * */


    static boolean recursion(int i, int leap, int[] game) {

        if ((i < 0) || (game[i] == 1)) {
            return false;
        }

        if ((i == game.length - 1) || (i + leap > game.length - 1)) {
            return true;
        }
        game[i] = 1;
        return recursion(i - 1, leap, game) || recursion(i + 1, leap, game) || recursion(i + leap, leap, game);

    }


    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean result = recursion(0, leap, game);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }

}
