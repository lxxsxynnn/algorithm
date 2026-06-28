import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int n = 0;

        while(!a.equals(b) && n < a.length()){
            a = a.substring(a.length() - 1, a.length()) 
                + a.substring(0, a.length() - 1);
            n++;
        }
        
        System.out.print(a.equals(b)? n : -1);
    }
}