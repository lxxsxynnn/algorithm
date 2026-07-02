import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(getPow(a, b));
    }

    public static int getPow(int n, int m){
        return (int)Math.pow(n, m);
    }
}