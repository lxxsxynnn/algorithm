import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int reversedA = 0;
        int reversedB = 0;

        while(A > 0 && B > 0){
            reversedA = reversedA * 10 + (A % 10);
            reversedB = reversedB * 10 + (B % 10);

            A = A / 10;
            B = B / 10;
        }

        System.out.println(Math.max(reversedA, reversedB));
    }
}
