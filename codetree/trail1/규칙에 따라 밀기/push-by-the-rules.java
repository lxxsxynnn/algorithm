import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String command = sc.next();

        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'L'){
                a = a.substring(1, a.length()) + a.substring(0, 1);
            } else {
                a = a.substring(a.length() - 1, a.length()) + a.substring(0, a.length() - 1);
            }
        }
        
        System.out.println(a);
    }
}