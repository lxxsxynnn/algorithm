import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];
        int a = 1;

        for (int sum = 0; sum < N + M - 1; sum++) {
            int row = Math.max(0, sum - (M - 1));
            int col = Math.min(sum, M - 1);

            while (row < N && col >= 0) {
                arr[row][col] = a++;
                row++;
                col--;
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}