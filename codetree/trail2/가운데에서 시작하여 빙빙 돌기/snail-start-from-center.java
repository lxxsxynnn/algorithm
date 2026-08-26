import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = n / 2;
        int c = n / 2;
        int[][] arr = new int[n][n];

        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};
        int dir = 0;
        int move = 1;
        int cnt = 0;
        
        for(int i = 0; i < n * n; i++){
            arr[r][c] = i + 1;
            cnt++;
            
            if (cnt == move) {
                r += dx[dir];
                c += dy[dir];
                cnt = 0;
                dir = (dir + 1) % 4;
                if (dir % 2 == 0) move++;
            } else {
                r += dx[dir];
                c += dy[dir];
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}