import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = (s.charAt(j));
            }
        }

        int startNum = sc.nextInt();
        int cnt = 0;
        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};
        int x, y, dirNum;

        if (startNum <= n) {
            x = 0;
            y = (startNum - 1) % n;
            dirNum = 3;
        } else if (startNum <= 2 * n) {
            x = (startNum - 1) % n;
            y = n - 1;
            dirNum = 0;
        } else if (startNum <= 3 * n) {
            x = n - 1;
            y = n - 1 - (startNum - 1) % n;
            dirNum = 1;
        } else {
            x = n - 1 - (startNum - 1) % n;
            y = 0;
            dirNum = 2;
        }

        while(true){
            if(x < 0 || x >= n || y < 0 || y >= n) break;

            cnt++;

            if(grid[x][y] == '/'){
                if(dirNum == 0) dirNum = 3;
                else if(dirNum == 1) dirNum = 2;
                else if(dirNum == 2) dirNum = 1;
                else dirNum = 0;
            } else {
                if(dirNum == 0) dirNum = 1;
                else if(dirNum == 1) dirNum = 0;
                else if(dirNum == 2) dirNum = 3;
                else dirNum = 2;
            }

            x += dx[dirNum];
            y += dy[dirNum];
        }

        System.out.print(cnt);
    }
}