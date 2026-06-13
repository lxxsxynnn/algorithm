import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[][] = new int[N][N];

        while(M-- > 0){
            int r = sc.nextInt();
            int c = sc.nextInt();

            arr[r - 1][c - 1] = r * c;
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}