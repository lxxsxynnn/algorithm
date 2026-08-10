import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int cnt = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            int curr = sc.nextInt();

            if(curr > t) cnt++;
            else cnt = 0;

            max = Math.max(max, cnt);
        }

        System.out.print(max);
    }
}