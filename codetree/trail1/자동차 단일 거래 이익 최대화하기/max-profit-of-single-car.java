import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int price[] = new int[N];

        for(int i = 0; i < N; i++){
            price[i] = sc.nextInt();
        }

        int answer = 0;

        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                answer = Math.max(answer, price[j] - price[i]);
            }
        }

        System.out.print(answer);
    }
}