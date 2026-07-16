import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(getDigitSum(a, b, c));
    }

    public static int getDigitSum(int n, int m, int l){
        int mul = n * m * l;
        int sum = 0;

        while(mul > 0){
            sum += mul % 10;
            mul /= 10;
        }

        return sum;
    }
}