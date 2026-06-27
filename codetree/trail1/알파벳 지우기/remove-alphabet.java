import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) < '0' || a.charAt(i) > '9') continue;
            sb1.append(a.charAt(i));
        }

        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) < '0' || b.charAt(i) > '9') continue;
            sb2.append(b.charAt(i));
        }

        System.out.print(Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString()));
    }
}