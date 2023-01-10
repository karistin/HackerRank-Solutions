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

    private static boolean back(int[] game, int i) {
        try {
            if (game[i - 1] == 0) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    private static boolean walk(int[] game, int i) {
        try {
            if (game[i + 1] == 0) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    private static boolean jump(int[] game, int i, int leap) {
        try {
            System.out.println("JUMP : "+ (i + leap));
            if ((i + leap >= game.length)) {
                return true;
            }
            else if ( (game[i + leap] == 0)) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int i = 0;
        boolean flag = true;
        while (i != (game.length - 1)) {
            if (i > game.length - 1) {
                break;
            }
            System.out.println(i);
            /*
            * walk 나 back이나 jump가 가능하면 한다.
            * */
            if (walk(game, i) && flag) {
                i++;
            } else if (back(game, i)) {
                flag = false;
                i--;
                if (jump(game, i, leap)) {
                    System.out.println("Jump Val : "+ (i + leap));
                    i = i + leap;
                }
            } else {
                return false;
            }
        }
        return true;
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
