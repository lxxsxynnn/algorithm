import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        int cnt = 1;
        int max = 1;

        for(int i = 1; i < n; i++){
            int curr = sc.nextInt();

            if(prev == curr) cnt++;
            else cnt = 1;

            max = Math.max(max, cnt);
            prev = curr;
        }

        System.out.print(max);
    }
}