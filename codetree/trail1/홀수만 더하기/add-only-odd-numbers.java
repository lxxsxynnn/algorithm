import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        while(N-- > 0){
            int num = sc.nextInt();

            if(num % 2 == 1 && num % 3 == 0) sum += num;
        }

        System.out.println(sum);
    }
}