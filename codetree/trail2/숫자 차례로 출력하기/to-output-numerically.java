import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1ToN(n);
        System.out.println();
        printNTo1(n);
    }

    public static void print1ToN(int n){
        if(n == 0)
            return;

        print1ToN(n - 1);
        System.out.print(n + " ");
    }

    public static void printNTo1(int n){
        if(n == 0)
            return;
        System.out.print(n + " ");

        printNTo1(n - 1);
    }
}