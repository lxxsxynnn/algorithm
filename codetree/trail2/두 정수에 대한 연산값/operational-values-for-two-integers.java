import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a > b){
            a = plus25(a);
            b = multiply2(b);
        } else {
            a = multiply2(a);
            b = plus25(b);
        }

        System.out.print(a + " " + b);
    }

    public static int plus25(int n){
        return n + 25;
    }

    public static int multiply2(int n){
        return n * 2;
    }
}