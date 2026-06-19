import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            sb.append(sc.nextInt());

            while (sb.length() >= 5) {
                System.out.println(sb.substring(0, 5));
                sb.delete(0, 5);
            }
        }

        if (sb.length() > 0) {
            System.out.println(sb);
        }
    }
}