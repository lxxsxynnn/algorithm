import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 9;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(cnt == 0) cnt = 9;
                System.out.print(cnt--);
            }
            System.out.println();
        }
    }
}