import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int divisor = 0;

        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                divisor++;
            }
        }

        System.out.println((divisor == 2)? "P" : "C");
    }
}