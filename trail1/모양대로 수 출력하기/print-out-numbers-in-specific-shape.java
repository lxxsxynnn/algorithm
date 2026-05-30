import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            for(int j = N; j > 0; j--){
                if(i + j <= N + 1) System.out.print(j + " ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}