import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = sc.next();

            if(str.equals("0")) break;
            
            cnt++;
            if(cnt % 2 == 1) sb.append(str + "\n");
        }

        System.out.println(cnt);
        System.out.println(sb);
    }
}