import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        int dir = 0;
        int r = 0;
        int c = 0;

        for (int i = 1; i <= n * m; i++) {

            arr[r][c] = i;

            if (i == n * m) {
                break;
            }

            int nextR = r + dx[dir];
            int nextC = c + dy[dir];

            while (nextR < 0 || nextR >= n ||
                   nextC < 0 || nextC >= m ||
                   arr[nextR][nextC] != 0) {

                dir = (dir + 1) % 4;

                nextR = r + dx[dir];
                nextC = c + dy[dir];
            }

            r = nextR;
            c = nextC;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}