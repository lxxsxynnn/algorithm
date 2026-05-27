import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean exists = false;

        for(int i = a; i <= b; i++){
            if(i % c == 0){
                exists = true;
                break;
            }
        }

        System.out.println(exists? "NO" : "YES");
    }
}