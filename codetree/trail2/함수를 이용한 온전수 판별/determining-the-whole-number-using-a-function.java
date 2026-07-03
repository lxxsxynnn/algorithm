import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(isMagicNumber(a, b));
    }

    static int isMagicNumber(int n, int m){
        int cnt = 0;

        for(int i = n; i <= m; i++){
            if(i % 2 == 0 || i % 10 == 5 
            || (i % 3 == 0 && i % 9 != 0)) continue;

            cnt++;
        }

        return cnt;
    }
}