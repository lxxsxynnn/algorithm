import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        
        int cnt = 0;
        int si = 0, sj = 0;
        int ei = R - 1, ej = C - 1;

        for (int i1 = 1; i1 < R - 1; i1++) {
            for (int j1 = 0; j1 < C - 1; j1++) {
                if (i1 > 0 && j1 > 0 && grid[0][0] != grid[i1][j1]) {
                    for(int i2 = i1 + 1; i2 < R - 1; i2++){
                        for(int j2 = j1 + 1; j2 < C - 1; j2++){
                            if(grid[i1][j1] != grid[i2][j2] 
                            && grid[i2][j2] != grid[ei][ej]) cnt++;
                        }
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}