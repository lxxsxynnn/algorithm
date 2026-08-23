import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] points = new int[n][n];

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        
        for (int i = 0; i < m; i++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            points[r][c] = 1;

            int cnt = 0;
            
            for(int j = 0; j <= 3; j++){
                if(0 <= r + dx[j] && r + dx[j] < n 
                && 0 <= c + dy[j] && c + dy[j] < n){
                    if(points[r + dx[j]][c + dy[j]] == 1) cnt++;
                }
            }

            System.out.println(cnt == 3? 1 : 0);
        }
    }
}