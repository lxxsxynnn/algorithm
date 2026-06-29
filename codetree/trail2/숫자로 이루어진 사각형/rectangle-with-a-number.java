import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printStars(n);
    }

    public static void printStars(int n){
        int a = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(a > 9) a = 1;
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }
}