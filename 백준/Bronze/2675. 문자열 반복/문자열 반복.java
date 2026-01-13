import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int R = sc.nextInt();
            String str = sc.next();

            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < str.length(); j++){
                for (int k = 0; k < R; k++) {
                    sb.append(str.charAt(j));
                }
            }

            System.out.println(sb);
        }
    }
}
