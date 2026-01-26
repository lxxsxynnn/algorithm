import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][];

        for (int i = 0; i < N; i++) {
            arr[i] = new int[]{sc.nextInt(), sc.nextInt()};
        }

        boolean[][] colored = new boolean[100][100];

        for (int i = 0; i < N; i++) {

            for (int j = arr[i][0]; j < arr[i][0] + 10; j++) {
                for (int k = arr[i][1]; k < arr[i][1] + 10; k++) {
                    colored[j][k] = true;
                }
            }
        }

        int area = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                area += colored[i][j] ? 1 : 0;
            }
        }

        System.out.println(area);
    }
}
