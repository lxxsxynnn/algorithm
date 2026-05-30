import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char C = 'A';

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(C > 'Z') C = 'A';
                if(i >= j) System.out.print((char) C++);
            }
            System.out.println();
        }
    }
}