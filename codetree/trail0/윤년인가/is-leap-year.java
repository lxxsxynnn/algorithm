import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();

        if(Y % 4 == 0) {
            System.out.println((Y % 100 == 0 && Y % 400 != 0)? "false" : "true");
        }
        else System.out.println("false");
    }
}