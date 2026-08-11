import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = 0;
        int b = 0;
        
        char[] ad = new char[n];
        int[] at = new int[n];
        char[] bd = new char[m];
        int[] bt = new int[m];

        int totalTime = 0;
        int answer = -1;

        for (int i = 0; i < n; i++) {
            ad[i] = sc.next().charAt(0);
            at[i] = sc.nextInt();
            totalTime += at[i];
        }

        for(int i = 0; i < m; i++){
            bd[i] = sc.next().charAt(0);
            bt[i] = sc.nextInt();
        }

        int aIdx = 0;
        int bIdx = 0;

        for(int i = 0; i < totalTime; i++){
            if(ad[aIdx] == 'L') a--;
            else a++;

            if(bd[bIdx] == 'L') b--;
            else b++;

            if(a == b){
                answer = i + 1;
                break;
            }

            at[aIdx]--;
            bt[bIdx]--;
            if(at[aIdx] == 0) aIdx++;
            if(bt[bIdx] == 0) bIdx++;
        }

        System.out.print(answer);
    }
}