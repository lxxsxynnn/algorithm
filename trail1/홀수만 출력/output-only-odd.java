import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i = A; i <= B; i++){
            if(i % 2 == 0) continue;
            System.out.print(i + " ");
        }
    }
}