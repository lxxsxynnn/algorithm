import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char C = sc.next().charAt(0);
        int N = sc.nextInt();

        if(C == 'A'){
            for(int i = 1; i <= N; i++){
                System.out.print(i + " ");
            }
        } else {
            for(int i = N; i > 0; i--){
                System.out.print(i + " ");
            }
        }
    }
}