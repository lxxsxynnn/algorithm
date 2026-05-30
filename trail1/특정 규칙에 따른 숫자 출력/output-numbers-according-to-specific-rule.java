import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 1;

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                if(sum == 10) sum = 1;
                if(i <= j) System.out.print(sum++ + " ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}