import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while(N-- > 0){
            int a = sc.nextInt();
            sb.append(a);

            if(sb.length() >= 5){
                String str = sb.toString();

                for(int i = 0; i < 5; i++){
                    System.out.print(str.charAt(i));
                }

                sb = new StringBuilder();

                for(int i = 5; i < str.length(); i++){
                    sb.append(str.charAt(i));
                }

                System.out.println();
            }
        }

        System.out.println(sb);
    }
}