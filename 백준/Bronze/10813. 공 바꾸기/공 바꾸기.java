import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];

        for (int k = 0; k < N; k++) {
            arr[k] = k + 1;
        }

        for (int idx = 0; idx < M; idx++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int tmp;

            tmp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = tmp;
        }

        for (int k = 0; k < N; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
