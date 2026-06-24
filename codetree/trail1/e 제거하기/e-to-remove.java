import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == 'e'){
                a = a.substring(0, i) + a.substring(i + 1);
                break;
            }
        }

        System.out.print(a);
    }
}