import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt() + 8;
        int length = sc.nextInt() * 3;
        System.out.printf("%d\n%d\n%d", width , length, (width * length));
    }
}