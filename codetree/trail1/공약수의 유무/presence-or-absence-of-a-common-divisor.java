import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i = A; i <= B; i++){
            if(1920 % i == 0 && 2880 % i == 0){
                System.out.println(1);
                return;
            }
        }

        System.out.println(0);
    }
}