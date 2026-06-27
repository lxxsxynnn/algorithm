import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while(n-- > 0){
            sum += sc.nextInt();
        }

        String str = Integer.toString(sum);

        System.out.print(str.substring(1, str.length()) + str.substring(0, 1));
    }
}