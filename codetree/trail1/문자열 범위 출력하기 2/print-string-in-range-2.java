import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            if(str.length() - i < 0) break;
            System.out.print(str.charAt(str.length() - i));
        }
    }
}