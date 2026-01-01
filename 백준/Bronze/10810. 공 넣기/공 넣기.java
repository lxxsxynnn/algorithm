import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();


        int[] arr = new int[N];

        for (int l = 0; l < M; l++) {
            int i =  sc.nextInt();
            int j =  sc.nextInt();
            int k =  sc.nextInt();

            for (int idx = i-1; idx < j; idx++) {
                arr[idx] = k;
            }
        }

        for (int l = 0; l < N; l++) {
            System.out.print(arr[l] + " ");
        }
    }
}
