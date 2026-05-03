import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int n = sc.nextInt();
                if(i >= j) sum += n;
            }
        }
        System.out.println(sum);
    }
}