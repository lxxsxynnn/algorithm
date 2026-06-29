import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        getLCM(n, m);
    }
    
    public static void getLCM(int n, int m){
        int a = n;
        int b = m;

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        System.out.println(n * m / a);
    }
}