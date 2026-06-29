import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        getLCM(n, m);
    }
    
    public static void getLCM(int n, int m){
        for(int i = Math.max(n, m); i <= n * m; i++){
            if(i % n == 0 && i % m == 0){
                System.out.print(i);
                break;
            }
        }
    }
}