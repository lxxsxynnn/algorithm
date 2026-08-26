import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        int r = 0;
        int c = 0;
        int dir = 0;

        for(int i = 0; i < n * m; i++){
            arr[r][c] = (char)('A' + (i % 26));
            
            int nx = r + dx[dir];
            int ny = c + dy[dir];

            if(nx < 0 || nx >= n || ny < 0 || ny >= m || arr[nx][ny] != '\0'){
                dir = (dir + 1) % 4;

                nx = r + dx[dir];
                ny = c + dy[dir];
            }

            if(i == n * m - 1) break;

            r = nx;
            c = ny;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}