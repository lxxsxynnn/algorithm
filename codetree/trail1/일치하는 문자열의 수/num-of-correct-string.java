import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a = sc.next();

        int cnt = 0;

        while(n-- > 0){
            if(a.equals(sc.next())) cnt++;
        }

        System.out.print(cnt);
    }
}