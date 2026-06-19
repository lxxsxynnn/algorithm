import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.print((str.indexOf(c) >= 0)? str.indexOf(c) : "No");
    }
}