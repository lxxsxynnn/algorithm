import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int n = 0;

        if (s.isEmpty()) {
            System.out.println(n);
            return;
        }

        n = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                n++;
            }
        }

        System.out.println(n);
    }
}
