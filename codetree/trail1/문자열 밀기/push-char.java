import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int l = a.length();

        a = a.substring(1, l) + a.substring(0, 1);

        System.out.print(a);
    }
}