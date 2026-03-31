import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String num = br.readLine();
            if(num.equals("0")) break;

            int len = 1;

            for (int i = 0; i < num.length(); i++) {
                char digit = num.charAt(i);
                if(digit == '0') len += 5;
                else if(digit == '1') len += 3;
                else len+= 4;
            }

            sb.append(len).append("\n");
        }

        System.out.println(sb);
    }
}