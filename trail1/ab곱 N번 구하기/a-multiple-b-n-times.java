import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while(N-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int prod = 1;

            for(int i = a; i <= b; i++){
                prod *= i;
            }

            System.out.println(prod);
        }
    }
}