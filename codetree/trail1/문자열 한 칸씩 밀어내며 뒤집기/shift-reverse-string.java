import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int q = sc.nextInt();

        while(q-- > 0){
            int command = sc.nextInt();

            if(command == 1){
                a = a.substring(1, a.length()) + a.substring(0, 1);
            } else if(command == 2){
                a = a.substring(a.length() - 1, a.length()) + a.substring(0, a.length() - 1);
            } else {
                StringBuffer sb = new StringBuffer(a);
                a = sb.reverse().toString();
            }

            System.out.println(a);
        }
    }
}