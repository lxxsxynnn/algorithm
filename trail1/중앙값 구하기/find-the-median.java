import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if((B < A && A < C) || C < A && A < B) System.out.println(A);
        else if((A < B && B < C) || (C < B && B < A)) System.out.println(B);
        else System.out.println(C);
    }
}