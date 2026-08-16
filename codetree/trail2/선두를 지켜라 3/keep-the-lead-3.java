import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] av = new int[n];
        int[] at = new int[n];
        int[] bv = new int[m];
        int[] bt = new int[m];
        int totalTime = 0;

        for(int i = 0; i < n; i++){
            av[i] = sc.nextInt();
            at[i] = sc.nextInt();
            totalTime += at[i];
        }

        for(int i = 0; i < m; i++){
            bv[i] = sc.nextInt();
            bt[i] = sc.nextInt();
        }

        int a = 0;
        int b = 0;
        int idxA = 0;
        int idxB = 0;
        int prev = 0; // A: 1 B: 2 AB: 3
        int curr;
        int cnt = 0;

        for(int i = 0; i < totalTime; i++){
            a += av[idxA];
            at[idxA]--;
            if(at[idxA] == 0 && idxA + 1 < n) idxA++;

            b += bv[idxB];
            bt[idxB]--;
            if(bt[idxB] == 0 && idxB + 1 < m) idxB++;

            if(a > b) curr = 1;
            else if(a < b) curr = 2;
            else curr = 3;

            if(curr != prev) cnt++;
            prev = curr;
        }

        System.out.print(cnt);
    }
}