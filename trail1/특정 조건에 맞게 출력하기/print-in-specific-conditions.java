import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if (n == 0) break;

            if(n % 2 == 1) System.out.print(n + 3 + " ");
            else System.out.print(n / 2 + " ");
        }
    }
}