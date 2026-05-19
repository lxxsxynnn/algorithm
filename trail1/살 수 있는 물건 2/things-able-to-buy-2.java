import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String product = "";

        if(N >= 3000) product = "book";
        else if(N >= 1000) product = "mask";
        else if(N >= 500) product = "pen";
        else product = "no";

        System.out.println(product);
    }
}