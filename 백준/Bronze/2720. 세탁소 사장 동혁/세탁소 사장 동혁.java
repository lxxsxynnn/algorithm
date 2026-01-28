import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] coins = {25, 10, 5, 1};

        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            int idx = 0;

            while (idx < coins.length) {
                System.out.print(C/coins[idx] + " ");
                C %= coins[idx];
                idx++;
            }
            System.out.println();
        }
    }
}