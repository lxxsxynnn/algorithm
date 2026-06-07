import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();

        while (M-- > 0) {
            int cnt = 0;
            int N = sc.nextInt();

            while(true){
                if(N == 1) break;

                if(N % 2 == 0) N /= 2;
                else N = N * 3 + 1;

                cnt++;
            }

            System.out.println(cnt);
        }
    }
}