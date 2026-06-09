import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][N];

        int a = N * N;

        for(int i = 0; i < N; i++){
            if(i % 2 == N % 2){
                for(int j = N - 1; j >= 0; j--){
                    arr[j][i] = a--;
                }
            } else {
                for(int j = 0; j < N; j++){
                    arr[j][i] = a--;
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}