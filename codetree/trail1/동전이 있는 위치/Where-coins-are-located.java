import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[][] = new int[N][N];

        for(int i = 0; i < M; i++){
            int row = sc.nextInt();
            int col = sc.nextInt();

            arr[row - 1][col - 1] = 1;
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}