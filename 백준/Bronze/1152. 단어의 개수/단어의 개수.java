import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = 0;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                inWord = false;
            } else if (!inWord && s.charAt(i) != ' ') {
                inWord = true;
                n ++;
            }
        }

        System.out.println(n);
    }
}
