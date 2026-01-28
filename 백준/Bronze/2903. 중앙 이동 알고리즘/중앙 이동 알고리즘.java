import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        /*
        * 1 -> 점의 수: 3 * 3 => 2 ^ 1 + 1
        * 2 -> 점의 수: 5 * 5 => 2 ^ 2 + 1
        * 3 -> 점의 수: 9 * 9 => 2 ^ 3 + 1
        * 4 -> 점의 수: 17 * 17 => 2 ^ 4 + 1
        *
        * 모든 점의 수 : 2 ^ N + 1
        * */

        int point = 0;

        for (int i = 0; i < N; i++) {
            point = (int) Math.pow(2, N) + 1;
        }

        System.out.println(point * point);
    }
}