import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        
        System.out.print(calculator(a, o, c));
    }

    public static String calculator(int n, char c, int m){
        
        switch(c){
            case '+':
                return n + " + " + m + " = " + (n + m);
            case '-':
                return n + " - " + m + " = " + (n - m);
            case '*':
                return n + " * " + m + " = " + (n * m);
            case '/':
                return n + " / " + m + " = " + (n / m);
            default:
                return "False";
        }
    }
}