import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] tA = new int[n];
        char[] dA = new char[n];
        int[] tB = new int[m];
        char[] dB = new char[m];
        int totalA = 0;
        int totalB = 0;

        for(int i = 0; i < n; i++){
            tA[i] = sc.nextInt();
            dA[i] = sc.next().charAt(0);
            totalA += tA[i];
        }

        for(int i = 0; i < m; i++){
            tB[i] = sc.nextInt();
            dB[i] = sc.next().charAt(0);
            totalB += tB[i];
        }

        int idxA = 0;
        int idxB = 0;
        int A = 0;
        int B = 0;
        int cnt = 0;

        for(int i = 0; i < Math.max(totalA, totalB); i++){
            int prevA = A;
            int prevB = B;

            if(i < totalA){
                if(dA[idxA] == 'L') A--;
                else A++;
                
                tA[idxA]--;

                if(tA[idxA] == 0 && idxA + 1 < n) idxA++;
            }

            if(i < totalB){
                if(dB[idxB] == 'L') B--;
                else B++;
                
                tB[idxB]--;

                if(tB[idxB] == 0 && idxB + 1 < m) idxB++;
            }

            if (prevA != prevB && A == B) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}