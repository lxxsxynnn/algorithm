import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            a = getDouble(a);
            b = addTen(b);
        } else {
            a = addTen(a);
            b = getDouble(b);
        }

        System.out.print(a + " " + b);
    }

    public static int getDouble(int n){
        return n * 2;
    }

    public static int addTen(int n){
        return n + 10;
    }
}