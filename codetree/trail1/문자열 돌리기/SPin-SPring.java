import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int l = a.length();

        for(int i = 0; i <= a.length(); i++){
            System.out.println(a);
            a = a.substring(l - 1, l) + a.substring(0, l - 1);
        }
    }
}