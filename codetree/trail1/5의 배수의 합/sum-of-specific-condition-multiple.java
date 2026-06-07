import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = 0;

        for(int i = (A > B? B : A); i <= (A > B? A : B); i++){
            if(i % 5 == 0){
                sum += i;
            }
        }

        System.out.print(sum);
    }
}