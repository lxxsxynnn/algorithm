import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while(N-- > 0){
            int a = sc.nextInt();
            if(a % 3 == 0 && a % 2 == 1) System.out.println(a);
        }
    }
}