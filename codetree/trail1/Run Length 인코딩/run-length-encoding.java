import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int cnt = 1;

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < a.length(); i++){
            if(a.charAt(i - 1) == a.charAt(i)){
                cnt++;
            } else {
                sb.append(a.charAt(i - 1)).append(cnt);
                cnt = 1;
            }
        }

        sb.append(a.charAt(a.length() - 1)).append(cnt);
    
        System.out.print(sb.length() + "\n" + sb);
    }
}