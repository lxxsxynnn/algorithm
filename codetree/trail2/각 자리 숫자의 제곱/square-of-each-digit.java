import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(getPowSum(n));
    }

    public static int getPowSum(int n){
        if(n < 10) return n * n;

        int a = n % 10;
        n /= 10;

        return a * a + getPowSum(n);
    }
}