import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int numCnt[] = new int[9];

        for(int i = 0; i < N; i++){
            numCnt[sc.nextInt() - 1]++;
        }

        for(int cnt: numCnt){
            System.out.println(cnt);
        }
    }
}