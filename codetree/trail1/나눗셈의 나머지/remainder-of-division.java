import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] left = new int[10];

        while(A > 1){
            left[A % B]++;
            A /= B;
        }

        int sum = 0;

        for(int num : left){
            sum += num * num;
        }

        System.out.println(sum);
    }
}