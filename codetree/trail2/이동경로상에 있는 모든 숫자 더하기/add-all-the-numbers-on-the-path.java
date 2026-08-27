import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, -1, 0, 1};

        int r = n / 2;
        int c = n / 2;

        int dir = 0;

        int sum = board[r][c];

        for(int i = 0; i < t; i++){
            char a = commands.charAt(i);

            if(a == 'L'){
                dir = (dir + 1) % 4;
            } else if(a == 'R'){
                dir = (dir - 1 + 4) % 4;
            } else {
                int nr = r + dr[dir];
                int nc = c + dc[dir];

                if(nr < 0 || nr >= n || nc < 0 || nc >= n) continue;

                r = nr;
                c = nc;

                sum += board[r][c];
            }
        }

        System.out.print(sum);
    }
}