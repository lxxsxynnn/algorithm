import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        while (true) {
            if(N % 2 == 0) N = N * 3 + 1;
            else N = N * 2 + 2;
            
            cnt++;

            if(N >= 1000) break;
        }

        System.out.println(cnt);
    }
}