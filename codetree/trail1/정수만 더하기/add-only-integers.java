import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        int sum = 0;

        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);

            if('1' <= c && c <= '9'){
                sum += c - '1' + 1;
            }
        }

        System.out.print(sum);
    }
}